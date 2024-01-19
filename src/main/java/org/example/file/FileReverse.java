package org.example.file;

import java.io.IOException;

public class FileReverse {
    FileUtils fileUtils;

    public FileReverse(FileUtils fileUtils) {
        this.fileUtils = fileUtils;
    }

    public void fileReverse(String inputFile, String outputFile) throws IOException {
        String inputContent=fileUtils.readFile(inputFile);
        String outputContent =  new StringBuilder(inputContent).reverse().toString();
        fileUtils.writeFile(outputFile,outputContent);
    }
}
