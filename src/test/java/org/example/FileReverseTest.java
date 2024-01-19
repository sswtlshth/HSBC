package org.example;

import org.example.file.FileReverse;
import org.example.file.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class FileReverseTest {
    private String input="input.txt";
    private String output="output.txt";

    @Test
    public void testReadFile() throws IOException {
        FileUtils utils = mock(FileUtils.class);
        when(utils.readFile(input)).thenReturn("sweta");
        FileReverse re = new FileReverse(utils);
        re.fileReverse(input,output);
        verify(utils,times(1)).readFile(input);
        verify(utils,times(1)).writeFile(output,"atews");
    }
    @Test
    public void testIfFileNotExists_ThrowsException() throws IOException {
        FileUtils utils = mock(FileUtils.class);
        when(utils.readFile(input)).thenThrow(IOException.class);
        FileReverse re = new FileReverse(utils);
        Assertions.assertThrows(IOException.class,() -> re.fileReverse(input,output));
    }
}
