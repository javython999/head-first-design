package com.errday.headfirstdesign.chapter1.duck;

import com.errday.headfirstdesign.chapter1.duck.fly.FlyWithWings;
import com.errday.headfirstdesign.chapter1.duck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

}
