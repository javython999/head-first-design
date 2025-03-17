package com.errday.headfirstdesign.decorator.starbuzz;

public abstract class Beverage {

    private String description = "Beverage Description";

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

}
