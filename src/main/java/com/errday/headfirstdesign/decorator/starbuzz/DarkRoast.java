package com.errday.headfirstdesign.decorator.starbuzz;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        setDescription("DarkRoast");
    }

    public double cost() {
        return 0.99;
    }
}
