package com.errday.headfirstdesign.command.remoteControl.seilingfan;

import com.errday.headfirstdesign.command.remoteControl.Command;

public class CeilingFanHighCommand implements Command {

    private final CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
