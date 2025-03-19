package com.errday.headfirstdesign.chapter1.duck;

import org.junit.jupiter.api.Test;

public class DuckTest {

    @Test
    void MallardDuckTest() {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
        mallardDuck.swim();
    }

    @Test
    void RubberDuckTest() {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.display();
        rubberDuck.swim();
    }
}
