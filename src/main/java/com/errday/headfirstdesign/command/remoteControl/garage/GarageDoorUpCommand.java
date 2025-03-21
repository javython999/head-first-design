package com.errday.headfirstdesign.command.remoteControl.garage;

import com.errday.headfirstdesign.command.remoteControl.Command;

public class GarageDoorUpCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
