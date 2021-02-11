package com.example.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.UserEntity;
import com.example.repository.UserEntityCrudRepository;



@Transactional
@Service
public class UserServiceImpl implements UserService {
	
	
	
		@Autowired
		private UserEntityCrudRepository userEntityCrudRepository;

		@Override
		public UserEntity save(UserEntity user) {
			// TODO Auto-generated method stub
			return userEntityCrudRepository.save(user);
		}

		@Override
		public Optional<UserEntity> findById(String  userid) {
			// TODO Auto-generated method stub
			return userEntityCrudRepository.findById(userid);
		}
		@Override
		public boolean login(String userid, String pwd) {
			
			if(findById(userid).get().getPwd().equals(pwd)) {
				return true;
			}
			return false;
		}


	}


