package com.donglin.utils;

public class Solution {


    public int gcd(int a,int b){
        return b == 0 ? a : (a % b);
    }
}
