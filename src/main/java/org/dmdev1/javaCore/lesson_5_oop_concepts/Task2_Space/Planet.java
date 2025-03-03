package org.dmdev1.javaCore.lesson_5_oop_concepts.Task2_Space;

/*
 * au stand for astronomical unit
 *
 */

public class Planet extends AstronomicalObject {
    private double au;

    public Planet(String name, long diameterInKm, double massInSolarM, double au) {
        super(name, diameterInKm, massInSolarM);
        this.au = au;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "mass = " + getMassInSolarM() +
                ", diameter = " + getDiameterInKm() +
                ", au= " + au +
                ", name ='" + getName() + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
