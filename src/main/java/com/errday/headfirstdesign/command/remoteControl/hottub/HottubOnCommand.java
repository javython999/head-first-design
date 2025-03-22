package com.errday.headfirstdesign.command.remoteControl.hottub;

import com.errday.headfirstdesign.command.remoteControl.Command;

public class HottubOnCommand implements Command {

    private final Hottub hottub;
    private float previousTemperature;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        previousTemperature = hottub.getTemperature();
        hottub.setTemperature(40);
    }

    @Override
    public void undo() {
        hottub.setTemperature(previousTemperature);
    }
}
