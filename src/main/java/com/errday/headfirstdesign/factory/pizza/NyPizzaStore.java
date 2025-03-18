package com.errday.headfirstdesign.factory.pizza;

public class NyPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NyStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new NyStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            return new NyStyleClamPizza();
        } else if ("veggie".equals(type)) {
            return new NyStyleVeggiePizza();
        }
        return null;
    }
}
