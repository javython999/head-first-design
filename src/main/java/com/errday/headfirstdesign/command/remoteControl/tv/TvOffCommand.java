package com.errday.headfirstdesign.command.remoteControl.tv;

import com.errday.headfirstdesign.command.remoteControl.Command;

public class TvOffCommand implements Command {

    private final Tv tv;
    private int previousChannel;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        previousChannel = tv.getChannel();
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
        tv.setChannel(previousChannel);
    }
}
