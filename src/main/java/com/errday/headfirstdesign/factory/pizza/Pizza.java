package com.errday.headfirstdesign.factory.pizza;

import com.errday.headfirstdesign.factory.ingredient.cheese.Cheese;
import com.errday.headfirstdesign.factory.ingredient.clams.Clam;
import com.errday.headfirstdesign.factory.ingredient.dough.Dough;
import com.errday.headfirstdesign.factory.ingredient.pepperoni.Pepperoni;
import com.errday.headfirstdesign.factory.ingredient.sauce.Sauce;
import com.errday.headfirstdesign.factory.ingredient.veggies.Veggies;
import lombok.Getter;
import lombok.Setter;

public abstract class Pizza {

    @Getter
    @Setter
    String name;

    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;


    public abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분간 굽기");
    }
    public void cut() {
        System.out.println("8조각으로 커팅");
    }
    public void box() {
        System.out.println("상자에 피자 담기");
    }
}
