package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.UserEntity;

public interface UserEntityCrudRepository extends CrudRepository<UserEntity, String> {

}
