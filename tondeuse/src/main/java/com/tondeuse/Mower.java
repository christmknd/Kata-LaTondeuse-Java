package com.tondeuse;

import com.tondeuse.enums.Orientation;

public class Mower {

    private Position position;
    private Orientation orientation;
    private Lawn lawn;

    public Mower(Position position, Orientation orientation, Lawn lawn) {
        this.position = position;
        this.orientation = orientation;
        this.lawn = lawn;
    }

    // getters

    public Position getPosition() {
        return position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    // methods

    public void turnLeft() {

    }

    public void turnRight() {

    }

}
