package com.practice.example.basic;

public class DayOneExercise {
    public boolean oddOrEven(int input){
        if(input%2 == 0){
            return true;
        } else {
            return false;
        }
    }
    public String[] reverseArray(String [] inputArr){
        String outputArr [] = new String [inputArr.length];
        for(int i=0;i<inputArr.length;i++){
            outputArr[inputArr.length-i-1] = inputArr[i];
        }
        return outputArr;
    }

    public boolean checkPalindrome(String inputStr){//Java
        char chIn [] =  inputStr.toCharArray();//0-J,1-A,2-V,3-A
        char chOut [] = new char[inputStr.length()];
        for(int i=0;i<chIn.length;i++){
            chOut[chOut.length-i-1] = chIn[i];
        }
        if(inputStr.equals(String.valueOf(chOut))){
            return true;
        } else {
            return false;
        }
    }
    public void checkNumber(int input){
        if(input >500 & input<1000){
            System.out.println("Yes it comes between 500 to 1000");
        } else {
            System.out.println("No it did not come between 500 to 1000");
        }
    }
    //{15,5,3,6,9,26,51,4}
    public void findLargestNumberFromArray(int[] inputArray){//1,2,30,4,5,6,7
        int largeNumber=inputArray[0];//1
        for(int i=1;i<inputArray.length;i++){//i=1,2,3,4,5,6
            if(largeNumber<inputArray[i]) {//1<2,2<30,30<4,30<5,30<6,30<7
                largeNumber = inputArray[i];//largerNumber=2,30
            }
        }
        System.out.println(largeNumber);//30
    }
    //{2,1,45,6,23,765,3,-1,45,56,76}
    public void sortingArray(int arr1[]){
        int outArr [] = arr1; int temp=0;
        for(int i=0;i<outArr.length;i++){//i=0
            for(int j=i+1;j< outArr.length;j++) {//j=1,2,3,4
                if (outArr[i] > outArr[j]){//2>1,2>45,2>6,2>23
                    temp = outArr[j];
                    outArr[j]=outArr[i];
                    outArr[i]=temp;
                    //{1,2,45,6,23,765,3,-1,45}
                }
            }
        }
        for(int i=0;i<outArr.length;i++){
            System.out.print(outArr[i]+" ");
        }
    }

    public int findLargerNumberFromThree(int x,int y,int z){
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }
}
