package com.errday.headfirstdesign.factory.pizza;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    @Getter
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println(name + " 피자 준비중...");
        System.out.println("도우를 돌리는 중...");
        System.out.println("소스를 뿌리는 중...");
        System.out.println("토핑을 올리는 중...");
        for (String topping : toppings) {
            System.out.println(topping);
        }
    }
    void bake() {
        System.out.println("175도에서 25분간 굽기");
    }
    void cut() {
        System.out.println("8조각으로 커팅");
    }
    void box() {
        System.out.println("상자에 피자 담기");
    }
}
