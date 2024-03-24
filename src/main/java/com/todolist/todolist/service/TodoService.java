package com.todolist.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.todolist.todolist.entity.Todo;
import com.todolist.todolist.repository.ToDoRepository;

@Service
public class TodoService {

	private ToDoRepository repository;

	public TodoService(ToDoRepository repository) {

		this.repository = repository;

	}

	public List<Todo> create(Todo todo) {
		repository.save(todo);
		return list();
	}

	public List<Todo> list() {
		//Sort sort = org.springframework.data.domain.Sort.by("prioridade").descending();
	 return repository.findAll();
		

	}

	public List<Todo> update(Todo todo) {
		repository.save(todo);
		return list();

	}

	public List<Todo> delete(Long id) {
		repository.deleteById(id);
		return list();

	}

}
