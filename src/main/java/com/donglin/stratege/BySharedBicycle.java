package com.donglin.stratege;

public class BySharedBicycle implements CalculateStrategy {
    @Override
    public int calculateTrafficFee(int distance) {
        return 2;
    }
}