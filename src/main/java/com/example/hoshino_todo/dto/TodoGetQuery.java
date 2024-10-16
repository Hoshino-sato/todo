package com.example.hoshino_todo.dto;

import lombok.Data;

@Data
public class TodoGetQuery {

    private int hoshinoId;
    private int offset;

    public TodoGetQuery() {
        hoshinoId = 10;
        offset = 20;
    }
}
    
