package org.example;

import org.example.file.FileReverse;
import org.example.file.FileUtils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileUtils file = new FileUtils();
        FileReverse re = new FileReverse(file);
        try {
            re.fileReverse("input.txt", "out.txt");
        }catch (IOException e){
            System.out.println("Error occurred while reading or writing a file");
            System.out.println("Exception "+e);
        }
    }
}