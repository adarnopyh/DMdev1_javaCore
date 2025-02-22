package org.dmdev1.level2.introduction.homework_Task1.objects;

public class House {

    private int number;
    private Floor[] floors;

    public House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "This house number is " + number
                + ", this house consists of " + floors.length +
                (floors.length > 1 ? " floors" : " floor");
    }

    public void print() {
        System.out.println(toString());
        for (Floor floor : floors) {
            floor.print();
        }
    }
}
