package com.donglin.decorator;

public class CoffeeDecorator implements ICoffee{
    private ICoffee coffee;
    public CoffeeDecorator(ICoffee iCoffee){
        this.coffee = iCoffee;
    }

    @Override
    public void makeCoffee() {
        coffee.makeCoffee();
    }
}
