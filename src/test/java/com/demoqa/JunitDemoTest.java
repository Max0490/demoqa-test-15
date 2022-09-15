package com.demoqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitDemoTest {

    @Test
    void simpleTestFirst() {
        Assertions.assertTrue(3>2);
    }
    @Test
    void simpleTestSecond() {
        Assertions.assertTrue(3>2);
    }
}
