package com.errday.headfirstdesign.iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {

    private final List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> iterator = menus.iterator();
        while (iterator.hasNext()) {
            Menu menu = iterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
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
