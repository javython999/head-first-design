package com.errday.headfirstdesign.factory.ingredient;

import com.errday.headfirstdesign.factory.ingredient.cheese.Cheese;
import com.errday.headfirstdesign.factory.ingredient.clams.Clam;
import com.errday.headfirstdesign.factory.ingredient.dough.Dough;
import com.errday.headfirstdesign.factory.ingredient.pepperoni.Pepperoni;
import com.errday.headfirstdesign.factory.ingredient.sauce.Sauce;
import com.errday.headfirstdesign.factory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Veggies[] createVeggies();
    Cheese createCheese();
    Pepperoni createPepperoni();
    Clam createClam();

}
