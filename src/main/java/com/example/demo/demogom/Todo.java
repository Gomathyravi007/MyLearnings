package com.example.demo.demogom;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue
	private int id;
	
	//@Column(name="name")
	private String userName;
	private String description;
	private LocalDate targetDate;
	private boolean done;
	public Todo(int id, String userName, String description, LocalDate localDate,  boolean done) {
		super();
		this.id = id;
		this.userName = userName;
		this.description = description;
		this.targetDate = localDate;
		this.done = done;
	}
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getDescription() {
		return description;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public boolean getDone() {
		return done;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", userName=" + userName + ", description=" + description + ", targetDate="
				+ targetDate + ", done=" + done + "]";
	}
	
	

}
