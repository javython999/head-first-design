package com.errday.headfirstdesign.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private final String name;
    private final String description;
    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String description, String name) {
        this.description = description;
        this.name = name;
    }

    @Override
    public boolean add(MenuComponent menuComponent) {
        return menuComponents.add(menuComponent);
    }

    @Override
    public boolean remove(MenuComponent menuComponent) {
        return menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponents.get(index);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("----------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
