package com.sapletta.rest;

import com.sapletta.rest.controller.UsersController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RestApplicationTests {

	@Autowired
	private UsersController usersController;

	@Test
	void contextLoads() throws Exception {
		assertThat(usersController).isNotNull();
	}

}
