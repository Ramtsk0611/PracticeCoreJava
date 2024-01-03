package com.practice.example.learning.fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args)
    {
        try {
            File Obj = new File("C:\\Users\\mohanram.kuppusamy\\IdeaProjects\\myfile.txt");
            if (Obj.createNewFile()) {
                System.out.println("File created: "+ Obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}

