package com.example.demo.demogom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

public interface TodoRepositary extends JpaRepository<Todo, Integer>{

}
