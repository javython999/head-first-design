package com.errday.headfirstdesign.state.gumballstate;

public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();

}
