package org.dmdev1.oop.introduction.homework_v1.dto;

import java.util.Arrays;

public class Floor {

    private int floorsNumber;

    private int[] apartmentsQty;

    public Floor(int floorsNumber, int[] apartmentsQty) {
        this.floorsNumber = floorsNumber;
        this.apartmentsQty = apartmentsQty;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public int[] getAppartmentsQty() {
        return apartmentsQty;
    }

    public void setAppartmentsQty(int[] apartmentsQty) {
        this.apartmentsQty = apartmentsQty;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "The floor number: " + floorsNumber +
                ", number of apartments: " + printArrayLength(apartmentsQty) +
                '}';
    }

    private String printArrayLength(int[] apartmentsQty) {
        return Integer.toString(apartmentsQty.length);
    }
}

