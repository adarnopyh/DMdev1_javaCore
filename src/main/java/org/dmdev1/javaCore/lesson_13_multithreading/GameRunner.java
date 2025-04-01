package org.dmdev1.javaCore.lesson_13_multithreading;

import org.dmdev1.javaCore.lesson_13_multithreading.magicians.AirMagician;
import org.dmdev1.javaCore.lesson_13_multithreading.magicians.FireMagician;

public class GameRunner {
    public static void main(String[] args) {
        FireMagician fireMagician = new FireMagician();
        AirMagician airMagician = new AirMagician();

        Thread fireThread = new Thread(fireMagician);
        Thread airThread = new Thread(airMagician);

        fireThread.start();
        airThread.start();
    }
}