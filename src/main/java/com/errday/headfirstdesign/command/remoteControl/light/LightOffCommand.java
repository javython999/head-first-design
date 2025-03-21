package com.errday.headfirstdesign.command.remoteControl.light;

import com.errday.headfirstdesign.command.remoteControl.Command;

public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
