package com.donglin.decorator;

public class OriginalCoffee implements ICoffee{
    @Override
    public void makeCoffee() {
        System.out.print("原味咖啡 ");
    }
}
