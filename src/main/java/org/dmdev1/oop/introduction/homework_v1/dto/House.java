package org.dmdev1.oop.introduction.homework_v1.dto;

public class House {

    private int houseNumber;
    private int[] floorsArray;

    public House(int houseNumber, int[] floorsArray) {
        this.houseNumber = houseNumber;
        this.floorsArray = floorsArray;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int[] getFloorsArray() {
        return floorsArray;
    }

    public void setFloorsArray(int[] floorsArray) {
        this.floorsArray = floorsArray;
    }
}
