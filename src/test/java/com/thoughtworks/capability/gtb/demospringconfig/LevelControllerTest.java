package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(properties = { "levelNumber=2" })
@ActiveProfiles("test")
class LevelControllerTest {

    @Autowired
    private LevelController levelController;

    @Test
    public void shouldProfiledProperty_overridePropertyValues() {
        String levelProperty = levelController.getLevel();

        assertEquals("advanced", levelProperty);
    }
}