package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.services.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping(path = "/")
	String hello() {
		logger.info("Mapping to index");
		return "user/index";
	}

	@PostMapping(path = "/login")
	String find(@RequestParam(name = "userid") String userid, @RequestParam(name = "pwd") String pwd) {
		logger.info("post mapping /find");

		if (userService.login(userid, pwd)) {
			return "user/welcome";
		}

		return "user/index";

	}

}
