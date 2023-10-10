package com.practice.example.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
    public static void main(String[] args)
    {
        try {
            File Obj = new File("C:\\Users\\mohanram.kuppusamy\\IdeaProjects\\myfile.txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}

