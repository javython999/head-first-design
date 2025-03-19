package com.errday.headfirstdesign.factory.ingredient;

import com.errday.headfirstdesign.factory.ingredient.cheese.Cheese;
import com.errday.headfirstdesign.factory.ingredient.cheese.MozzarellaCheese;
import com.errday.headfirstdesign.factory.ingredient.clams.Clam;
import com.errday.headfirstdesign.factory.ingredient.clams.FrozenClams;
import com.errday.headfirstdesign.factory.ingredient.dough.Dough;
import com.errday.headfirstdesign.factory.ingredient.dough.ThickCrustDough;
import com.errday.headfirstdesign.factory.ingredient.pepperoni.Pepperoni;
import com.errday.headfirstdesign.factory.ingredient.pepperoni.SlicedPepperoni;
import com.errday.headfirstdesign.factory.ingredient.sauce.PlumTomatoSauce;
import com.errday.headfirstdesign.factory.ingredient.sauce.Sauce;
import com.errday.headfirstdesign.factory.ingredient.veggies.BlackOlives;
import com.errday.headfirstdesign.factory.ingredient.veggies.EggPlant;
import com.errday.headfirstdesign.factory.ingredient.veggies.Spinach;
import com.errday.headfirstdesign.factory.ingredient.veggies.Veggies;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{
                new EggPlant(),
                new Spinach(),
                new BlackOlives()
        };
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams();
    }
}
