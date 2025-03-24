package com.errday.headfirstdesign.templatemethod.caffeinbeverage;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("brew coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("add sugar and milk");
    }
}
