package com.errday.headfirstdesign.decorator.starbuzz;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        printBeverageInfo(espresso);

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        printBeverageInfo(darkRoast);

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        printBeverageInfo(houseBlend);

    }

    private static void printBeverageInfo(Beverage beverage) {
        log.info("{}: {}", beverage.getDescription(), beverage.cost());
    }
}
