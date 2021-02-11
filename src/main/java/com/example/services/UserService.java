package com.example.services;

import java.util.Optional;

import com.example.entities.UserEntity;



public interface UserService {
	public UserEntity save(UserEntity user);
	public Optional<UserEntity> findById(String userid);
	public boolean login(String userid, String pwd);
}
