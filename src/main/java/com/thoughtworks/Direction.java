package com.thoughtworks;


public enum Direction {
    NORTH("N") {
        @Override
        public Direction getLeftDirection() {
        return WEST;
        }
    },
    EAST("E") {
        @Override
        public Direction getLeftDirection() {
            return NORTH;
        }

    },
    SOUTH("S") {
        @Override
        public Direction getLeftDirection() {
            return EAST;
        }
    },
    WEST("W") {
        @Override
        public Direction getLeftDirection() {
            return SOUTH;
        }
    };
    private String direction;

    Direction(String direction) {

        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public abstract Direction getLeftDirection();
}
