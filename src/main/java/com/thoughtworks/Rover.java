package com.thoughtworks;

public class Rover {

    private final int x;
    private final int y;
    private Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;

        this.direction = direction;
    }

    public String printStatus() {
        return String.format("%d %d %s", x, y, direction.getDirection());
    }

    public void turnLeft() {
        direction = direction.getLeftDirection();
    }
}
