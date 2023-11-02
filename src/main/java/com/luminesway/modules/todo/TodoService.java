/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luminesway.modules.todo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LSyaRe <lsyare.luminesway.com>
*/
@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo findById(long id) {
        return todoRepository.findById(id).orElseThrow();
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public void deleteById(long id) {
        todoRepository.deleteById(id);
    }

}
