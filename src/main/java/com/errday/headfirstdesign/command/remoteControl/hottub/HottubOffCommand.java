package com.errday.headfirstdesign.command.remoteControl.hottub;

import com.errday.headfirstdesign.command.remoteControl.Command;

public class HottubOffCommand implements Command {

    private final Hottub hottub;
    private float previousTemperature;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }


    @Override
    public void execute() {
        previousTemperature = hottub.getTemperature();
        hottub.setTemperature(20);
    }

    @Override
    public void undo() {
        hottub.setTemperature(previousTemperature);
    }
}
