package com.practice.example.learning.basic;

public class JavaExercise {
    public boolean isPalindrome(String str) {
        String rev = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
    public int largest(int arr[])
    {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    //Using Ternary operator
    public int biggestOfThree(int x, int y, int z)
    {
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }

}
