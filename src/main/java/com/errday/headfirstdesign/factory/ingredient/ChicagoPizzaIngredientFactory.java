package com.errday.headfirstdesign.factory.ingredient;

import com.errday.headfirstdesign.factory.ingredient.cheese.Cheese;
import com.errday.headfirstdesign.factory.ingredient.cheese.ReggianoCheese;
import com.errday.headfirstdesign.factory.ingredient.clams.Clam;
import com.errday.headfirstdesign.factory.ingredient.clams.FreshClams;
import com.errday.headfirstdesign.factory.ingredient.dough.Dough;
import com.errday.headfirstdesign.factory.ingredient.dough.ThinCrustDough;
import com.errday.headfirstdesign.factory.ingredient.pepperoni.Pepperoni;
import com.errday.headfirstdesign.factory.ingredient.pepperoni.SlicedPepperoni;
import com.errday.headfirstdesign.factory.ingredient.sauce.MarinaraSauce;
import com.errday.headfirstdesign.factory.ingredient.sauce.Sauce;
import com.errday.headfirstdesign.factory.ingredient.veggies.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()
        };
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClams();
    }

}
