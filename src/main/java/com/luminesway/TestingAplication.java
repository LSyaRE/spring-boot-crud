package com.luminesway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LSyaRe <lsyare.luminesway.com>
 */
@SpringBootApplication
@EnableJpaRepositories("com.luminesway")
public class TestingAplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(TestingAplication.class, args);
    }
    
}
