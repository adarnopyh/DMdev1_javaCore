package org.dmdev1.oop_level2.oop_concepts.Task2_Space;

import java.lang.Math;

import static org.dmdev1.oop_level2.oop_concepts.Task2_Space.SpaceConstants.*;

public final class SpaceUtils {


    private SpaceUtils() {
    }

    public static double gravitation(AstronomicalObject object1, AstronomicalObject object2, long distance) {
        return GRAVITATIONAL_CONSTANT.getValue() *
                (object1.getMassInSolarM() * object2.getMassInSolarM()) /
                Math.pow(distance, 2);
    }

    public static boolean isStar(AstronomicalObject object) {
        return object.getMassInSolarM() * SOLAR_MASS_IN_KG.getValue() >= SMALLEST_KNOWN_STAR_MASS_IN_KG.getValue();
    }


    public static double get_SOLAR_MASS_IN_KG() {
        return SOLAR_MASS_IN_KG.getValue();
    }

    private double getKgFromAU(AstronomicalObject object) {
        return object.getMassInSolarM() * (ONE_ASTRONOMICAL_UNIT_IN_M.getValue() / 1000);
    }

}
