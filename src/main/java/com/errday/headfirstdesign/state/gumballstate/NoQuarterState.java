package com.errday.headfirstdesign.state.gumballstate;

import com.errday.headfirstdesign.state.GumballMachine;
import com.errday.headfirstdesign.state.State;

public class NoQuarterState implements State {

    private GumballMachine gumballMachine;
    private final String INSERT_QUARTER_MESSAGE = "동전을 넣어주세요";

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println(INSERT_QUARTER_MESSAGE);
    }

    @Override
    public void turnCrank() {
        System.out.println(INSERT_QUARTER_MESSAGE);
    }

    @Override
    public void dispense() {
        System.out.println(INSERT_QUARTER_MESSAGE);
    }
}
