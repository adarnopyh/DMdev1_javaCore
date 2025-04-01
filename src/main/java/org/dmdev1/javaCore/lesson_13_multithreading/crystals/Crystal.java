package org.dmdev1.javaCore.lesson_13_multithreading.crystals;

public class Crystal {
    private final String color;

    public Crystal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Crystal{color='" + color + "'}";
    }
}