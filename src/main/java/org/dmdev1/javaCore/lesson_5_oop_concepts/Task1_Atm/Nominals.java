package org.dmdev1.javaCore.lesson_5_oop_concepts.Task1_Atm;

public enum Nominals {
    NOMINAL_10(10),
    NOMINAL_20(20),
    NOMINAL_50(50);

    private final int value;

    Nominals(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
