package com.errday.headfirstdesign.iterator;

public class MenuTestDrive {

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinnerMenu = new DinnerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu, cafeMenu);
        waitress.printMenu();
    }
}
