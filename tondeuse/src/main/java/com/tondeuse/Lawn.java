package com.tondeuse;

public class Lawn {

    private int maxX;
    private int maxY;

    Lawn(int maxX, int maxY) {
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

    // setters
    public int setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public int setMaxY( int maxY) {
        this.maxY = maxY
    }

    public boolean isPositionValid(Position position) {
    }

}
