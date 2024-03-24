package com.todolist.todolist.controller;

import java.util.List;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.todolist.entity.Todo;
import com.todolist.todolist.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {

	private TodoService service;

	public TodoController(TodoService service) {
		this.service = service;
	}

	@PostMapping
	public List<Todo> create(@RequestBody Todo todo) {
		return service.create(todo);
	}

	@GetMapping
	public List<Todo> list() {
		return service.list();
	}

	@PutMapping(path="/update")
	public List<Todo> update(@RequestBody Todo todo) {
		return service.update(todo);
	}

	@DeleteMapping("{id}")
	public List<Todo> delete(@PathVariable("id") Long id) {
		return service.delete(id);
	}

}
