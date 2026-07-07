package com.tondeuse.enums;

public enum Orientation {

    N, S, E, W;

    public Orientation left() {

        switch (this) {

            case N:
                return W;

            case W:
                return S;

            case S:
                return E;

            case E:
                return N;

            default:
                throw new IllegalStateException("Unknown orientation");
        }

    }

}
