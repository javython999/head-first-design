package com.errday.headfirstdesign.command.remoteControl.stereo;

import com.errday.headfirstdesign.command.remoteControl.Command;

public class StereoOffWithCdCommand implements Command {

    private final Stereo stereo;

    public StereoOffWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
