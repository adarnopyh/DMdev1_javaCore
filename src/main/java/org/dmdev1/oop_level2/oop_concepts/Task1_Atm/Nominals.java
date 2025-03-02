package org.dmdev1.oop_level2.oop_concepts.Task1_Atm;

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
