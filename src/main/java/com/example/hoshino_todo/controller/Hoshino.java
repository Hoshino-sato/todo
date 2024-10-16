package com.example.hoshino_todo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.hoshino_todo.dto.TodoGetQuery;



@RestController
public class Hoshino{

    @GetMapping("path")
    public String getMethodName(@ModelAttribute TodoGetQuery param) {

        System.out.println(param.getHoshinoId());
        System.out.println(param.getOffset());

        return "hoga";
    }

    @PostMapping("path")
    public String postMethodName(@RequestBody String entity) {

        //TODO: process POST request
        
        return entity;
    }

} 