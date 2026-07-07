package com.tondeuse.enums;

import com.tondeuse.Position;

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

    public Position nextPosition(Position position) {

        switch (this) {

            case N:
                return new Position(position.getX(),
                        position.getY() + 1);

            case E:
                return new Position(position.getX() + 1,
                        position.getY());

            case S:
                return new Position(position.getX(),
                        position.getY() - 1);

            case W:
                return new Position(position.getX() - 1,
                        position.getY());

            default:
                throw new IllegalStateException();
        }
    }
}
