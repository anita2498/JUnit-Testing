package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.annotation.Rollback;

import com.example.entities.UserEntity;
import com.example.services.UserService;
import com.example.services.UserServiceImpl;
@DataJpaTest
class AuthenticationTest {

	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */

	UserEntity user;

	@TestConfiguration
	static class ServiceImplTestContextConfiguration {

		@Bean
		public UserService userService() {
			return new UserServiceImpl();
		}
		
		
	}
	
	@Autowired
	UserServiceImpl userService;
	
	@Test
	@Rollback(false)
	void save() {
		user = new UserEntity();
		//user.setId(1);
		user.setPwd("asp");
		user.setUserid("as");
		userService.save(user);
		UserEntity found = userService.findById("as").get();
		assertEquals(user, found);
		

	}
	@Test
	void login() {
		assertTrue(userService.login("as","asp"));
		/* assertTrue(repo.login("as1","asp1")); */
	}

}
