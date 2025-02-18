package org.dmdev1.oop.introduction.homework_v1.dto;

public class Apartment {

    private int apartmentNumber;
    private int[] apatmentRoomsQty;

    public Apartment(int apartmentNumber, int[] apatmentRoomsQty) {
        this.apartmentNumber = apartmentNumber;
        this.apatmentRoomsQty = apatmentRoomsQty;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int[] getApatmentRoomsQty() {
        return apatmentRoomsQty;
    }

    public void setApatmentRoomsQty(int[] apatmentRoomsQty) {
        this.apatmentRoomsQty = apatmentRoomsQty;
    }
}
