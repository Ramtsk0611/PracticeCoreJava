package com.practice.example.basic.loopPractice;
public class PatternProgram {
    void pyramid(int length) {
        int half = length / 2;
        if(length%2!=0){
            half++;
        }
        for (int x=0; x<half; x++) {
            for (int y=0; y<length; y++) {
                if (y<half) {
                    if (y>=half-x-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                if (y>=half) {
                    if (y<half+x+1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
    void diamond(int length){
        int half = length/2;
        int count =1;
        for(int x=0;x<length;x++){
            for(int y=0;y<length;y++){
                if(x<half && y<half) {
                    if (y>=half-x-1) {
                        System.out.print("*");
                    }else {
                        System.out.print("-");
                    }
                } else if(x>=half && y<half){
                    if (y>=x-half) {
                        System.out.print("*");
                    }else {
                        System.out.print("-");
                    }
                }
                if(x<half && y>=half) {
                    if (y<half+x+1) {
                        System.out.print("*");
                    }else {
                        System.out.print("-");
                    }
                } else if(x>=half && y>=half){
                    if (y<(length+half)-x) {
                        System.out.print("*");
                    }else {
                        System.out.print("-");
                    }
                }
            }
            System.out.println();
        }
    }
    public void squarePattern(int inputLength){
        for(int i=0;i<inputLength;i++){
            for(int j=0;j<inputLength;j++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
}
