package com.errday.headfirstdesign.factory.store;

import com.errday.headfirstdesign.factory.pizza.*;
import com.errday.headfirstdesign.factory.ingredient.NyPizzaIngredientFactory;
import com.errday.headfirstdesign.factory.ingredient.PizzaIngredientFactory;

public class NyPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        String localizedName = "Ny";
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            Pizza pizza = new CheesePizza(ingredientFactory);
            pizza.setName(localizedName + " Style Cheese Pizza");
            return pizza;
        } else if ("pepperoni".equals(type)) {
            Pizza pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName(localizedName + " Style Pepperoni Pizza");
            return pizza;
        } else if ("clam".equals(type)) {
            Pizza pizza = new ClamPizza(ingredientFactory);
            pizza.setName(localizedName + " Style Clam Pizza");
            return pizza;
        } else if ("veggie".equals(type)) {
            Pizza pizza = new VeggiePizza(ingredientFactory);
            pizza.setName(localizedName + " Style Veggie Pizza");
            return pizza;
        }

        return null;
    }
}
