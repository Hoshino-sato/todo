package com.example.hoshino_todo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Hoshino{
    @GetMapping("path")

    public String getMethodName() {
        return "hoge";
    }
}
