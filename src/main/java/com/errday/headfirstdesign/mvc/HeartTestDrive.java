package com.errday.headfirstdesign.mvc;

public class HeartTestDrive {

    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface controller = new HeartController(heartModel);
    }
}
