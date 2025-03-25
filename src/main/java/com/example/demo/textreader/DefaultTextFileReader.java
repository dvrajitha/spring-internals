package com.example.demo.textreader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class DefaultTextFileReader implements TextFileReader {
    private final Path filePath;

    public DefaultTextFileReader(String filePath) {
        try {
            this.filePath = Paths.get(Objects.requireNonNull(getClass().getClassLoader()
                            .getResource(filePath))
                    .toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<String> readAllLines() {
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file: " + filePath, e);
        }
    }
}
