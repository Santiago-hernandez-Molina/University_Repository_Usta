package com.codegym.task.task03.task0312;

/* 
Time conversion

*/

public class Solution {
    //write your code here

    public static void main(String[] args) {
        //write your code here
        System.out.println(convertToSeconds(3));
        System.out.println(convertToSeconds(5));
    }
    public static int convertToSeconds(int hour){
        return hour*3600;
    }
}
