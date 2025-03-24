package com.errday.headfirstdesign.templatemethod.caffeinbeverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeWithHookTest {

    @Test
    void coffeeWithHookTest() {
        TeaWithHook tea = new TeaWithHook();
        CoffeeWithHook coffee = new CoffeeWithHook();

        System.out.println("tea 준비중...");
        tea.prepareRecipe();

        System.out.println("coffee 준비중...");
        coffee.prepareRecipe();
    }

}