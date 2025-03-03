package org.dmdev1.javaCore.lesson_1_introduction.homework_Task1.objects;

public class Floor {

    private int number;
    private Apartment[] apartments;

    public Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public String toString() {
        return "This floor is number: " + number +
                ", it has " + apartments.length +
                (apartments.length > 1 ? " apartments" : " apartment");
    }

    public void print() {
        System.out.println(toString());
        for (Apartment apartment : apartments) {
            apartment.print();
        }
    }

}

