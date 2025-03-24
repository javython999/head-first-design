package com.errday.headfirstdesign.templatemethod.caffeinbeverage;

public class BeverageTestDriver {

    public static void main(String[] args) {
        TeaWithHook tea = new TeaWithHook();
        CoffeeWithHook coffee = new CoffeeWithHook();

        System.out.println("tea 준비중...");
        tea.prepareRecipe();

        System.out.println("coffee 준비중...");
        coffee.prepareRecipe();
    }
}
