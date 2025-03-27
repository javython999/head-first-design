package com.errday.headfirstdesign.state.monitor;

import com.errday.headfirstdesign.state.GumballMachine;

public class GumballMachineMonitor {

    GumballMachine gumballMachine;

    public GumballMachineMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("Location of the gumball is: " + gumballMachine.getLocation());
        System.out.println("Number of gumballs: " + gumballMachine.getCount());
        System.out.println("State of the gumball machine: " + gumballMachine.getState());
    }
}
