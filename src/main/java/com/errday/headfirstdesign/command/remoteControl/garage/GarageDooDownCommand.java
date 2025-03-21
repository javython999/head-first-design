package com.errday.headfirstdesign.command.remoteControl.garage;

import com.errday.headfirstdesign.command.remoteControl.Command;

public class GarageDooDownCommand implements Command {

    private final GarageDoor door;

    public GarageDooDownCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
    }

    @Override
    public void undo() {
        door.up();
    }
}
