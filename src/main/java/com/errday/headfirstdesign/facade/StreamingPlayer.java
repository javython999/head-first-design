package com.errday.headfirstdesign.facade;

public class StreamingPlayer {
    public void on() {
        System.out.println("turn on StreamingPlayer");
    }

    public void play(String movie) {
        System.out.println("playing " + movie);
    }

    public void stop() {
        System.out.println("stop StreamingPlayer");
    }

    public void off() {
        System.out.println("off StreamingPlayer");
    }
}
