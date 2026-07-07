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

    public Orientation right() {

        switch (this) {

            case N:
                return E;

            case E:
                return S;

            case S:
                return W;

            case W:
                return N;

            default:
                throw new IllegalStateException("Unknown orientation");
        }
    }
}
