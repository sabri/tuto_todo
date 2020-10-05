package com.springboot.tuto_todo.business;

import com.springboot.tuto_todo.model.Todo;
import org.jvnet.hk2.annotations.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
@Repository
@Component
@Configuration
public class TodoService {
    public TodoService() {
    }

    private Todo todo;
    List<Todo> data = new ArrayList<>( Arrays.asList(
            new Todo(1,"sabri","ma3lem java"),
            new Todo(1,"sabri","ma3lem java"),
            new Todo(1,"sabri","ma3lem java")
    ));
    public List<Todo> findAll(){
        return data;
    }
    public Todo getById(int id){
        for (Todo todos : data){
            if (todos.getId() == id) return todos;
        }
        return null;
    }
    public boolean save(Todo todos){return data.add(todos);}
    public void delete (int id){
        for (Todo todos : data) {
            if (todos.getId() == id)
                data.remove(todos);
        }
    }
}

