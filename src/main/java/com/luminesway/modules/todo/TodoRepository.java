/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.luminesway.modules.todo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author LSyaRe <lsyare.luminesway.com>
 */
public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAll();
}
