package com.errday.headfirstdesign.iterator;

import java.util.Iterator;

public class Waitress {

    private final Menu pancakeHouseMenu;
    private final Menu dinnerMenu;
    private final Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        System.out.println("메뉴\n-----\n아침 메뉴");
        printMenu(pancakeHouseMenu.createIterator());

        System.out.println("\n점심 메뉴");
        printMenu(dinnerMenu.createIterator());

        System.out.println("\n저녁 메뉴");
        printMenu(cafeMenu.createIterator());
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(menuItem.getName())
                    .append(", ")
                    .append(menuItem.getPrice())
                    .append(" -- ")
                    .append(menuItem.getDescription());
            System.out.println(stringBuffer);
        }
    }
}
