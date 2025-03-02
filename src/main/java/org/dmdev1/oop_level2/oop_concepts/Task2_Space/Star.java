package org.dmdev1.oop_level2.oop_concepts.Task2_Space;

public class Star extends AstronomicalObject{



    public Star(String name, long diameterInKm, double massInSolarM) {
        super(name, diameterInKm, massInSolarM);
    }

    @Override
    public String toString() {
        return "Star{} " + super.toString();
    }
}
