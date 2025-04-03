package com.errday.headfirstdesign.mvc;

public class DjTestDrive {

    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);

    }
}
