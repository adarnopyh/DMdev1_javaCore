package org.dmdev1.oop_level2.oop_concepts.Task2_Space;

public enum SpaceConstants {

    SOLAR_MASS_IN_KG(1.98847 * Math.pow(10, 30)),
    EARTH_MASS_IN_KG(5.974 * Math.pow(10, 24)),
    SMALLEST_KNOWN_STAR_MASS_IN_KG(SOLAR_MASS_IN_KG.value * 0.075),
    GRAVITATIONAL_CONSTANT(6.674 * Math.pow(10, -11)),
    ONE_ASTRONOMICAL_UNIT_IN_M(149597870700L);

    private final double value;

    SpaceConstants(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }


}
