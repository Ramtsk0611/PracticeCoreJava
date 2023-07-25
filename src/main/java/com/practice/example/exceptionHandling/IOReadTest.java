package com.practice.example.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOReadTest {
    public static void main(String [] args) throws Exception{
        FileReader in = new FileReader("C:\\Users\\mohanram.kuppusamy\\Desktop\\aws\\test\\nir.txt");
        BufferedReader bin = new BufferedReader(in);
        String line = null;
        while( (line = bin.readLine()) != null) {
            System.out.println(line);
            if(line.equals("Java")){
                throw new Exception("I'm throwing exception Due to Java in the File....");
            }
        }
    }
}
