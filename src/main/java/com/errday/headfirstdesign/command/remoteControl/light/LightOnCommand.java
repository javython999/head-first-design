package com.errday.headfirstdesign.command.remoteControl.light;

import com.errday.headfirstdesign.command.remoteControl.Command;

public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
