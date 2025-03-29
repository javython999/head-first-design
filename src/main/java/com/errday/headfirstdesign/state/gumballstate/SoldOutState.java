package com.errday.headfirstdesign.state.gumballstate;

import com.errday.headfirstdesign.state.GumballMachine;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;
    private final String SOLD_OUT_MESSAGE = "매진되었습니다. 다음 기회에 이용해주세요.";

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣을 수 없습니다. " + SOLD_OUT_MESSAGE);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 반환할 수 없습니다. " + SOLD_OUT_MESSAGE);
    }

    @Override
    public void turnCrank() {
        System.out.println(SOLD_OUT_MESSAGE);
    }

    @Override
    public void dispense() {
        System.out.println(SOLD_OUT_MESSAGE);
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
