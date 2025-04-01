package org.dmdev1.javaCore.lesson_13_multithreading.crystals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CrystalFactory {
    private static final Random RANDOM = new Random();
    private static final String[] COLORS = {"Red", "White"};

    public static List<Crystal> createCrystals() {
        int count = RANDOM.nextInt(4) + 2;
        List<Crystal> crystals = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String color = COLORS[RANDOM.nextInt(COLORS.length)];
            crystals.add(new Crystal(color));
        }

        return crystals;
    }
}