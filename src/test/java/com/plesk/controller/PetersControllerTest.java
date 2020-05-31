package com.plesk.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PetersControllerTest {

    @Test
    public void testPublish_givenValidString_returnsValidString() {
        //assemble
        String name = "Peter";

        //act
        PetersController petersController = new PetersController();

        //assert
        Assertions.assertEquals("Peter", petersController.publish(name));

    }
}
