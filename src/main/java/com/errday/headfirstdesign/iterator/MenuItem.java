package com.errday.headfirstdesign.iterator;

import lombok.Getter;

@Getter
public class MenuItem {

    private String name;
    private String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }


}
