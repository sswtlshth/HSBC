package org.example.file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {
    public String readFile(String inputFile) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(inputFile));
        return new String(encoded, StandardCharsets.UTF_8);
    }

    public void writeFile(String outputFile,String content) throws IOException {
        FileWriter writer = new FileWriter(outputFile);
        writer.write(content);
        writer.flush();
    }
}
