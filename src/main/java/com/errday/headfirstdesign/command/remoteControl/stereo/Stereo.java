package com.errday.headfirstdesign.command.remoteControl.stereo;

public class Stereo {

    private String playType;
    private int volume;

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void setCd() {
        this.playType = "CD";
        System.out.println("Stereo setCd");
    }

    public void setDvd() {
        this.playType = "DVD";
        System.out.println("Stereo set CD");
    }

    public void setRadio() {
        this.playType = "Radio";
        System.out.println("Stereo setRadio");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo set volume: " + volume);
    }
}
