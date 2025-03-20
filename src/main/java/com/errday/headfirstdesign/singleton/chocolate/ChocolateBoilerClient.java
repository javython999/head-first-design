package com.errday.headfirstdesign.singleton.chocolate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChocolateBoilerClient {

    public static void main(String[] args) {

        ChocolateBoiler chocolateBoiler0 = ChocolateBoiler.getInstance();
        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
        log.info("chocolateBoiler0 == chocolateBoiler1 ? {}", chocolateBoiler0 == chocolateBoiler1);


        ChocolateBoilerEnum chocolateBoilerEnum0 = ChocolateBoilerEnum.INSTANCE;
        ChocolateBoilerEnum chocolateBoilerEnum1 = ChocolateBoilerEnum.INSTANCE;
        log.info("chocolateBoilerEnum0 == chocolateBoilerEnum1 ? {}", chocolateBoilerEnum0 == chocolateBoilerEnum1);
    }
}
