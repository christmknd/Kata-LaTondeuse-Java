package com.tondeuse;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tondeuse.enums.Orientation;

public class OrientationTest {

    @Test
    public void shouldTurnLeftFromNorthToWest() {
        assertEquals(Orientation.W, Orientation.N.left());
    }
}
