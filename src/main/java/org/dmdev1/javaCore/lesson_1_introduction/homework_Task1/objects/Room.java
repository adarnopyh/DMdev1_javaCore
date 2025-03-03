package org.dmdev1.javaCore.lesson_1_introduction.homework_Task1.objects;

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

    @Override
    public String toString() {
        return "This room " + (isWalkThrough ? "is walk-through" : "is not walk-through");
    }

    public void print() {
        System.out.println(toString());
    }

}
