package com.springboot.tuto_todo.controller;

import com.springboot.tuto_todo.business.TodoService;
import com.springboot.tuto_todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.Target;
import java.util.List;


@RestController
@RequestMapping(value="todos/v1/todo")
public class HomeController {
    @Autowired
    private final TodoService todoservice;

    public HomeController() {
        todoservice = new TodoService();
    }


    @GetMapping({"","/home"})
    public List<Todo> get_all_todos(){
        return todoservice.findAll();
    }
    @GetMapping(value = {"","/{id}"})
    public Todo get_todo_by_id(@PathVariable int id){
        return todoservice.getById(id);
    }
    @PostMapping(value = {"","/home"})
    public Todo create_new_one(@RequestBody Todo todo){
        if (todoservice.save(todo)){
            return todo;
        }

        return null;
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        todoservice.delete(id);
    }
}

    

