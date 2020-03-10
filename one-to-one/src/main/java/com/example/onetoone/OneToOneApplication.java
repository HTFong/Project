package com.example.onetoone;

import com.example.onetoone.domains.Address;
import com.example.onetoone.domains.User;
import com.example.onetoone.repositories.AddressRepository;
import com.example.onetoone.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneToOneApplication.class, args);
    }

    @Bean
    public CommandLineRunner mappingDemo(UserRepository userRepository, AddressRepository addressRepository) {
        return args -> {
            // create a user instance
            User user = new User("John Doe", "john.doe@example.com", "1234abcd");

            // create an address instance
            Address address = new Address("Lake View 321", "Berlin", "Berlin",
                    "95781", "DE");

            // set child reference
            address.setUser(user);

            // set parent reference
            user.setAddress(address);

            // save the parent
            // which will save the child (address) as well
            userRepository.save(user);
        };
    }
}
