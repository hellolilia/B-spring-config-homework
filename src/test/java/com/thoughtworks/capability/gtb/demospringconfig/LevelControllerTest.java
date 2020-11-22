package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
class LevelControllerTest {

    @Autowired
    private LevelController levelController;

    @Test
    public void shouldGetAdvancedWhenLevelNumberIsTwo() {

        String levelProperty = levelController.getLevel();

        assertEquals("advanced", levelProperty);
    }

}