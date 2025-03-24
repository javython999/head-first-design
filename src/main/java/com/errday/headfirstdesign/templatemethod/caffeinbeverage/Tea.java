package com.errday.headfirstdesign.templatemethod.caffeinbeverage;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("tea brew");
    }

    @Override
    void addCondiments() {
        System.out.println("add lemon");
    }
}
