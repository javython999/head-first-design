package com.errday.headfirstdesign.facade;

public class Amplifier {

    private StreamingPlayer streamingPlayer;

    public void on() {
        System.out.println("turn on Amplifier");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.streamingPlayer = player;
        System.out.println("set streaming player " + streamingPlayer);
    }

    public void setSurroundSound() {
        System.out.println("set surround sound");
    }

    public void setVolume(int volume) {
        System.out.println("set volume " + volume);
    }

    public void off() {
        System.out.println("turn off Amplifier");
    }
}
