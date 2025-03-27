package com.errday.headfirstdesign.state;

import com.errday.headfirstdesign.state.gumballstate.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class GumballMachine {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;


    @Setter
    private State state;
    private int count = 0;
    private String location;

    public GumballMachine(String location, int numberGumballs) {
        this.location = location;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0) {
            count -= 1;
        }
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled. its new count is " + count);
        state.refill();
    }
}
