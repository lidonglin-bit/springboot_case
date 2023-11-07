package com.donglin.stratege;

import java.util.regex.Pattern;

public class Sys {
    public static void main(String[] args) {
        int num = 12345; // 假设整数的值为12345

        double result = (double) num / Math.pow(10, String.valueOf(num).length());
        System.out.println(result);
        System.out.println(10+result);
    }
}

