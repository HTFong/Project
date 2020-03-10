package com.example.onetoone.repositories;

import com.example.onetoone.domains.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User,Long> {
}
