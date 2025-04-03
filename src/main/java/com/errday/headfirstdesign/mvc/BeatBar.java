package com.errday.headfirstdesign.mvc;

import javax.swing.*;

public class BeatBar extends JProgressBar implements Runnable {

    private static final long serialVersionUID = 2L;
    private JProgressBar progressBar;
    private Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    public void run() {
        while (true) {
            int value = getValue();
            value = (int)(value * .75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {};

        }
    }
}
