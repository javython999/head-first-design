package com.errday.headfirstdesign.command.remoteControl.tv;

public class Tv {

    private String location;
    private int channel;

    public Tv(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " tv is on");
    }

    public void off() {
        System.out.println(location + " tv is off");
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println(location + " tv set channel " + channel);
    }

    public int getChannel() {
        return channel;
    }

}
