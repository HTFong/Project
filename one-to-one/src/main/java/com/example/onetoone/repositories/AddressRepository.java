package com.example.onetoone.repositories;

import com.example.onetoone.domains.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository <Address,Long>{
}
