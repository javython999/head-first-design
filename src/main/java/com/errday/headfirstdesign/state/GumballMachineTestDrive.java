package com.errday.headfirstdesign.state;

import com.errday.headfirstdesign.state.monitor.GumballMachineMonitor;

public class GumballMachineTestDrive {

    public static void main(String[] args) {

        if (args.length < 0) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }


        GumballMachine gumballMachine = new GumballMachine(args[0], Integer.parseInt(args[1]));
        GumballMachineMonitor monitor = new GumballMachineMonitor(gumballMachine);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        monitor.report();
    }
}
