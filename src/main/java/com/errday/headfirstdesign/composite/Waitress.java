package com.errday.headfirstdesign.composite;

public class Waitress {

   private MenuComponent allMenu;

    public Waitress(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }

    public void printMenu() {
        allMenu.print();
    }
}
