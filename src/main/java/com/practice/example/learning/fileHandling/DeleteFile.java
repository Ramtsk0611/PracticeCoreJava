package com.practice.example.learning.fileHandling;

import java.io.File;
public class DeleteFile {
    public static void main(String[] args)
    {
        File Obj = new File("C:\\Users\\mohanram.kuppusamy\\IdeaProjects\\myfile.txt");
        if (Obj.delete()) {
            System.out.println("The deleted file is : "
                    + Obj.getName());
        }
        else {
            System.out.println(
                    "Failed in deleting the file.");
        }
    }
}

