package com.errday.headfirstdesign.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTheaterFacadeTest {

    @Test
    void homeTheater() {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(), new Tuner(), new StreamingPlayer(), new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());
        homeTheaterFacade.watchMovie("the rock");
        homeTheaterFacade.endMovie();
    }

}