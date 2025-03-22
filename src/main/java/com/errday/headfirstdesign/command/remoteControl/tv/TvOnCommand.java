package com.errday.headfirstdesign.command.remoteControl.tv;

import com.errday.headfirstdesign.command.remoteControl.Command;

public class TvOnCommand implements Command {

    private final Tv tv;
    private int previousChannel;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        previousChannel = tv.getChannel();
        tv.on();
    }

    @Override
    public void undo() {
        tv.setChannel(previousChannel);
        tv.off();
    }
}
