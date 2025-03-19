package com.errday.headfirstdesign.factory;

import com.errday.headfirstdesign.factory.store.ChicagoPizzaStore;
import com.errday.headfirstdesign.factory.store.NyPizzaStore;
import com.errday.headfirstdesign.factory.pizza.Pizza;
import com.errday.headfirstdesign.factory.store.PizzaStore;
import org.junit.jupiter.api.Test;

public class PizzaStoreTest {

    @Test
    void PizzaStoreTest() {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("홍길동이 주문한 " + nyCheesePizza.getName());

        System.out.println();

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("김길동이 주문한 " + chicagoCheesePizza.getName());
    }
}
