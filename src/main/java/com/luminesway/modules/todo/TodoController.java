/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luminesway.modules.todo;

import com.luminesway.global.config.Config;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author LSyaRe <lsyare.luminesway.com>
 */
@RestController
@CrossOrigin({"*"})
@RequestMapping(Config.V1 + "todo") 
public class TodoController {
    
    @Autowired 
    TodoService todoService;
    
    @GetMapping("/")
    public List<Todo> findAll(){
        return todoService.findAll();
    }
    
    @PostMapping("/")
    public Todo create(@RequestBody Todo todo){
        return todoService.save(todo);
    }
    
    @PutMapping("/{id}/")
    public Todo update(@RequestBody Todo todo){
        return todoService.save(todo);
    }
    
    
    @DeleteMapping("/{id}/")
    public void delete(@PathVariable long id){
        todoService.deleteById(0);
    } 
    
    
    
}
