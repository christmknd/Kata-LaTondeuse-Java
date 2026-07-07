package com.tondeuse;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tondeuse.enums.Orientation;

public class MowerTest {

    @Test

    public void testMowerConstructor() {
        Lawn lawn = new Lawn(5, 5);
        Position position = new Position(3, 4);
        Orientation orientation = Orientation.N;

        Mower mower = new Mower(position, orientation, lawn);

        assertEquals(position, mower.getPosition());
        assertEquals(orientation, mower.getOrientation());
    }

}
