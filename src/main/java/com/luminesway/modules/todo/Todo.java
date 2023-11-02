/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luminesway.modules.todo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import lombok.Data;

/**
 *
 * @author LSyaRe <lsyare.luminesway.com>
 */
@Data
@Entity
@Table(name = "todo")
public class Todo {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) 
   private long id;
   
   private String name;
   
   @Column(columnDefinition = "boolean default false")
   private boolean isChecked = false;
    
}
