package com.tondeuse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LawnTest {

    @Test

    public void testIsPositionValid() {

        Lawn lawn = new Lawn(5, 5);
        Position position = new Position(3, 4);

        boolean result = lawn.isPositionValid(position);

        assertTrue(result);

    }

}
