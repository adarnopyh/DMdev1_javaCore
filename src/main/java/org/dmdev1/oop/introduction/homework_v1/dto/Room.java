package org.dmdev1.oop.introduction.homework_v1.dto;

public class Room {
    private boolean isWalkThrough;

    public Room(boolean isWalkThrough) {
        this.isWalkThrough = isWalkThrough;
    }

    public boolean isWalkThrough() {
        return isWalkThrough;
    }

    public void setWalkThrough(boolean walkThrough) {
        isWalkThrough = walkThrough;
    }
}
