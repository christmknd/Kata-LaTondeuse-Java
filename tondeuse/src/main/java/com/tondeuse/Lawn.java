package com.tondeuse;

public class Lawn {

    private int maxX;
    private int maxY;

    public Lawn(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    // getters
    public int getMaxX() {
        return maxX;

    }

    public int getMaxY() {
        return maxY;
    }

    public boolean isPositionValid(Position position) {

        return 0 <= position.getX()
                && position.getX() <= this.maxX
                && 0 <= position.getY()
                && position.getY() <= this.maxY;
    }

}
