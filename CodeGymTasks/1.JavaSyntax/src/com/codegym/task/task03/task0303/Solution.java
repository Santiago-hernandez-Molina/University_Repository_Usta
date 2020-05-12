package com.codegym.task.task03.task0303;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        System.out.println(convertEurToUsd(123,435));
        System.out.println(convertEurToUsd(12,435));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //write your code here
        return (eur*exchangeRate);
    }
}
