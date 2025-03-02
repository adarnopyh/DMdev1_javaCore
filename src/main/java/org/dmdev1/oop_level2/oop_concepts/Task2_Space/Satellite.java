package org.dmdev1.oop_level2.oop_concepts.Task2_Space;

public class Satellite extends AstronomicalObject {

    private boolean isSpinning;

    public Satellite(String name, long diameterInKm, double massInSolarM, boolean isSpinning) {
        super(name, diameterInKm, massInSolarM);
        this.isSpinning = isSpinning;
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "isSpinning = " + isSpinning +
                "} " + super.toString();
    }

}
