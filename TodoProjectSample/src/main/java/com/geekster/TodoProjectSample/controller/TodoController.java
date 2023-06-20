package com.geekster.TodoProjectSample.controller;

import com.geekster.TodoProjectSample.objects.TodoObjects;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    private List<TodoObjects> todoObjectsList;
    public TodoController(){
        todoObjectsList = new ArrayList<>();
    }
    @GetMapping("todo")
    public List<TodoObjects> getAllTodos(){
        return todoObjectsList;
    }
    @GetMapping("todo/done")
    public List<TodoObjects> getAllDoneTodos(){
        List<TodoObjects> doneTodos = new ArrayList<>();
        for(TodoObjects mytodo : todoObjectsList){
            if(mytodo.getIstodoStatus())
                doneTodos.add(mytodo);
        }
        return doneTodos;
    }

    @GetMapping("todo/undone")
    public List<TodoObjects> getAllUndoneTodos(){
        List<TodoObjects> undoneTodos = new ArrayList<>();
        for(TodoObjects mytodo : todoObjectsList){
            if(!mytodo.getIstodoStatus())
                undoneTodos.add(mytodo);
        }
        return undoneTodos;
    }

    @PostMapping("todo")
    public String createTodo(@RequestBody TodoObjects mytodo){
        todoObjectsList.add(mytodo);
        return "Todo is Created.";
    }
    @PutMapping("todo")
    public String updateTodo(@RequestParam Integer id,@RequestParam  Boolean status){
        for(TodoObjects mytodo:todoObjectsList){
            if(mytodo.getId().equals(id)){
                mytodo.setIstodoStatus(status);
                return "Todo id: " +id +". Status is updated";
            }
        }
        return "Todo id: " +id +" - is not found";
    }
    @DeleteMapping("todo/{id}")
    public String removeTodo(@PathVariable Integer id){
        for(TodoObjects mytodo : todoObjectsList){
            if(mytodo.getId().equals(id)){
                todoObjectsList.remove(mytodo);
                return "Todo id: " +id +"- is deleted";
            }
        }
        return "Todo id: " +id +"- is not found";
    }
}
