package com.errday.headfirstdesign.composite;

public abstract class MenuComponent {

    public boolean add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }


}
