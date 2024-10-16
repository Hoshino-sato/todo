package com.example.hoshino_todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import com.example.hoshino_todo.dto.TodoGetQuery;

@RestController
public class Todo {
     @GetMapping("todo")
    public String getTodo(@ModelAttribute TodoGetQuery param) {

        System.out.println(param.getHoshinoId());
        System.out.println(param.getOffset());

        return "hogee";
    }
}