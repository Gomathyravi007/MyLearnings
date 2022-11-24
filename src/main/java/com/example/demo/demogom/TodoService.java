package com.example.demo.demogom;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int todocount=0;
	static {
		todos.add(new Todo(++todocount,"gom","Learn Aws",LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todocount,"gom","Learn Devops",LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todocount,"gom","Learn java",LocalDate.now().plusYears(3), false));
	}
	public List<Todo> findByUserName(){
		return todos;
	}

	public void addTodo1(String userName, String description, LocalDate plusYears, boolean done) {
		// TODO Auto-generated method stub
		Todo todo = new
				 Todo(++todocount,userName,description,plusYears,done); 
		todos.add(todo);
		
	}
	public boolean authentication(String description) {
			if(description == null || description.length() == 0) {
			return false;
		}
		return true;
	}
}

