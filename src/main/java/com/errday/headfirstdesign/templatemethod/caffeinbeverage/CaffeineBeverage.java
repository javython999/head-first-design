package com.errday.headfirstdesign.templatemethod.caffeinbeverage;

public abstract class CaffeineBeverage {

    /**
     * prepareRecipe() 메소드는 템플릿 메소드이다.
     * 이유는 다음과 같다.
     * 1. prepareRecipe()도 메소드다.
     * 2. 어떤 알고리즘의 템플릿(틀) 역할을 한다.
     * 서브 클래스에서 알고리즘을 수정하지 못하게 final로 선언한다.
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 서브 클래스 마다 다르게 처리되는 부분은 abstract로 선언한다.
     * 서브 클래스에서 구체적인 내용을 구현한다.
     */
    abstract void brew();
    abstract void addCondiments();

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring in cup");
    }
}
