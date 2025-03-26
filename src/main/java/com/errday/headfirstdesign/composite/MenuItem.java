package com.errday.headfirstdesign.composite;

import lombok.Getter;

@Getter
public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }


    @Override
    public void print() {
        StringBuilder builder = new StringBuilder();
        builder.append(" ").append(getName());
        if (isVegetarian()) {
            builder.append("(v)");
        }
        builder.append(", ").append(getPrice()).append("\n");
        builder.append("    -- ").append(getDescription()).append("\n");
        System.out.println(builder);
    }
}
