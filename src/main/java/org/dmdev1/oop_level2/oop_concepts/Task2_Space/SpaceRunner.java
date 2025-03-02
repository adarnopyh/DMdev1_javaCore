package org.dmdev1.oop_level2.oop_concepts.Task2_Space;


import static org.dmdev1.oop_level2.oop_concepts.Task2_Space.SpaceConstants.*;

public class SpaceRunner {
    public static void main(String[] args) {
        AstronomicalObject earth = new Planet("Earth", 12756, 0.0000030035, 1.00);
        AstronomicalObject jupiter = new Planet("Jupiter", 142800, 0.0009541985, 5.20);
        AstronomicalObject moon = new Satellite("Moon", 3475, 0.0000005035, false);
        AstronomicalObject ceres = new Asteroid("Ceres", 946, 0.0000000535);
        AstronomicalObject sun = new Star("Sun", 1392680, 1);

        earth.print();
        jupiter.print();
        moon.print();
        ceres.print();
        sun.print();

        System.out.println(earth.getName() + " is " + (SpaceUtils.isStar(earth) ? "a star" : "not a star"));
        System.out.println(jupiter.getName() + " is " + (SpaceUtils.isStar(jupiter) ? "a star" : "not a star"));
        System.out.println(sun.getName() + " is " + (SpaceUtils.isStar(sun) ? "a star" : "not a star"));

    }
}
