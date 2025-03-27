package com.errday.headfirstdesign.state;

public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();

}
