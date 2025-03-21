package com.errday.headfirstdesign.command.remoteControl.stereo;

import com.errday.headfirstdesign.command.remoteControl.Command;

public class StereoOnWithCdCommand implements Command {

    private final Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }

}
