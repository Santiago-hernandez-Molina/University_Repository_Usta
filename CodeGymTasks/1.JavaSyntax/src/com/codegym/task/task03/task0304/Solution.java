package com.codegym.task.task03.task0304;

/* 
Task with percentages

*/

public class Solution {
    public static double addTenPercent(int i) {
        //write your code here
        double inc =i*0.10;
        return inc+i;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
