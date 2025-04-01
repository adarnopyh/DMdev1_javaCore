package org.dmdev1.javaCore.lesson_13_multithreading.magicians;

import org.dmdev1.javaCore.lesson_13_multithreading.crystals.Crystal;
import org.dmdev1.javaCore.lesson_13_multithreading.crystals.CrystalFactory;

import java.util.List;

public abstract class Magician implements Runnable {
    protected int redCrystals = 0;
    protected int whiteCrystals = 0;
    private static final int MAX_CRYSTALS = 50;
    private static volatile boolean gameOver = false;

    public synchronized void collectCrystals() {
        if (gameOver) {
            return;
        }

        List<Crystal> crystals = CrystalFactory.createCrystals();

        for (Crystal crystal : crystals) {
            if ("Red".equals(crystal.getColor())) {
                redCrystals++;
            } else {
                whiteCrystals++;
            }
        }

        System.out.println(getClass().getSimpleName() + " | Red: " + redCrystals + ", White: " + whiteCrystals);

        if (isWinner()) {
            gameOver = true;
            System.out.println(getClass().getSimpleName() + " has WON!");
        }
    }

    private boolean isWinner() {
        return redCrystals >= MAX_CRYSTALS && whiteCrystals >= MAX_CRYSTALS;
    }

    @Override
    public void run() {
        while (!gameOver) {
            collectCrystals();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}