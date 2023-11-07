package com.donglin.stratege;

public class TrafficFeeCalculator {


    public int goToChengDuEye(CalculateStrategy strategy,int distance){
        return strategy.calculateTrafficFee(distance);
    }
}