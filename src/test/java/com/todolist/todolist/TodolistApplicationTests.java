package com.todolist.todolist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.todolist.todolist.entity.Todo;

@SpringBootTest
class TodolistApplicationTests {

	@Autowired
	private WebTestClient webtestclient;

	@Test
	void contextLoadsSucess() {

		var todo = new Todo(null, "Gomes", "LIndo", false, 1);
		
		webtestclient.post().uri("todos").exchange().expectStatus().isOk().expectBody().jsonPath("$").isArray();
		
		
	}

	@Test
	void contextLoadsFails() {

	}

}
