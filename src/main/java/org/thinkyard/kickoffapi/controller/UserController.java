package org.thinkyard.kickoffapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thinkyard.kickoffapi.entity.KickoffUserEntity;
import org.thinkyard.kickoffapi.service.KickoffUserService;
import org.thinkyard.kickoffapi.wrapper.Greeting;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by harshad on 22/08/16.
 */

@RestController
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	private static final String template = "Hello, %s!";

	@Autowired
	private KickoffUserService userService;

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") final String name) {
		LOGGER.info("username:\t" + name);
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public KickoffUserEntity saveUser() {

		LOGGER.info("inside saveUser()");

		return userService.saveUser();
	}
}
