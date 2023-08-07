package com.practice.example.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOReadTest {
    public static void main(String [] args) throws Exception{
        try {
            FileReader in = new FileReader("C:\\Users\\mohanram.kuppusamy\\Desktop\\aws\\test\\nir.txt");
            BufferedReader bin = new BufferedReader(in);
            String line = null;
            while ((line = bin.readLine()) != null) {
                System.out.println(line);
                if(line.equals("Java")){
                    throw new Exception("I'm throwing exception Due to Java in the File....");
                }
            }
        } catch(IOException io){
            System.out.println(io.getMessage());
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
