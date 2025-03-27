package com.example.demo.service.impl;

import com.filereader.api.TextFileReader;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyTextFileReader implements TextFileReader {
    @Override
    public List<String> readAllLines() {
        return List.of("My custom file content");
    }
}
