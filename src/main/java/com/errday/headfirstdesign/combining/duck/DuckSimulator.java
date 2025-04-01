package com.errday.headfirstdesign.combining.duck;

import com.errday.headfirstdesign.combining.duck.Observer.Quackologist;
import com.errday.headfirstdesign.combining.duck.composite.Flock;
import com.errday.headfirstdesign.combining.duck.decorator.QuackCounter;
import com.errday.headfirstdesign.combining.duck.factory.AbstractDuckFactory;
import com.errday.headfirstdesign.combining.duck.factory.CountingDuckFactory;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = duckFactory.createGooseDuck();

        Flock duckFlock = new Flock();
        duckFlock.quack();
        duckFlock.add(mallardDuck);
        duckFlock.add(redHeadDuck);
        duckFlock.add(duckCall);
        duckFlock.add(rubberDuck);
        duckFlock.add(goose);

        Flock mallardDuckFlock = new Flock();
        Quackable mallardDuck0 = duckFactory.createMallardDuck();
        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();
        mallardDuckFlock.add(mallardDuck0);
        mallardDuckFlock.add(mallardDuck1);
        mallardDuckFlock.add(mallardDuck2);
        mallardDuckFlock.add(mallardDuck3);
        mallardDuckFlock.add(mallardDuck4);
        System.out.println("\n오리 시뮬레이션");

        //duckFlock.quack();
        //mallardDuckFlock.quack();

        Quackologist quackologist = new Quackologist();
        duckFlock.registerObserver(quackologist);
        mallardDuckFlock.registerObserver(quackologist);

        simulate(duckFlock);
        simulate(mallardDuckFlock);


        System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getCountOfQuacked() + "번");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
