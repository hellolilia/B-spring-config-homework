package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class LevelControllerTest {

    @Autowired
    private LevelController levelController;

    @Test
    public void shouldGetBasicWhenLevelNumberIsZero() {

        String level = levelController.getLevel();

        assertEquals("basic", level);
    }
}