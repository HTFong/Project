package com.example.springbootstarterparent.repositories;

import com.example.springbootstarterparent.domains.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {


}

