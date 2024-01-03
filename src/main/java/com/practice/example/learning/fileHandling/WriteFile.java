package com.practice.example.learning.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args)
    {
        try {
            FileWriter Writer = new FileWriter("C:\\Users\\mohanram.kuppusamy\\IdeaProjects\\myfile.txt");
            Writer.write("Files in Java are seriously good!!");
            Writer.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}

