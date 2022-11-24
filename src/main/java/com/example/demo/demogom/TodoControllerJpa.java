package com.example.demo.demogom;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoControllerJpa {
	 private TodoService todoservice;
	 
	 private TodoRepositary dodoRepository;
	
	public TodoControllerJpa(TodoService todoservice,TodoRepositary dodoRepository) {
		super();
		this.todoservice = todoservice;
	}

	@RequestMapping("list-todo")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoservice.findByUserName();
		model.addAttribute("todos",todos);
		return "TodoWelcome";
	}
	@RequestMapping(value="showTodo", method = RequestMethod.GET)
	public String showTodos(ModelMap model) {
		String userName = (String) model.get("name");
		Todo todo = new Todo(0,userName,"check",LocalDate.now().plusYears(1),false);
		model.put("todo",todo);
		return "showTodo";
	}
	@RequestMapping(value="showTodo", method = RequestMethod.POST)
	public String addTodo(Todo todo,  ModelMap model) {
		String userName = (String) model.get("name");
		//if(todoservice.authentication(description)) {
			todoservice.addTodo1(userName, todo.getDescription(), LocalDate.now().plusYears(1), false);
		//}
		//todoservice.addTodo1(userName, description, LocalDate.now().plusYears(1), false);
		return "redirect:list-todo";
	}

}
