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

    @Test
    public void shouldExecuteInstructions() {

        Lawn lawn = new Lawn(5, 5);

        Mower mower = new Mower(
                new Position(3, 3),
                Orientation.E,
                lawn);

        mower.executeInstructions("AADAADADDA");

        assertEquals(5, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Orientation.E, mower.getOrientation());
    }

}
