package com.errday.headfirstdesign.iterator;

import java.util.List;

public class MenuTestDrive {

    public static void main(String[] args) {
        Waitress waitress = new Waitress(List.of(new PancakeHouseMenu(), new DinnerMenu(), new CafeMenu()));
        waitress.printMenu();
    }
}
