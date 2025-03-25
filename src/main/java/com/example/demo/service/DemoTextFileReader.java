package com.example.demo.service;

import com.example.demo.textreader.TextFileReader;

import java.util.List;

//@Component
public class DemoTextFileReader implements TextFileReader {
    @Override
    public List<String> readAllLines() {
        return List.of("In progress....");
    }
}
