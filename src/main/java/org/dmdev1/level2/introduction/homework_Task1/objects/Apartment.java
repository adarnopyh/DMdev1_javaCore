package org.dmdev1.level2.introduction.homework_Task1.objects;

public class Apartment {

    private int number;
    private Room[] rooms;

    public Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "This apartment number is " + number +
                ", and it has " + rooms.length +
                (rooms.length > 1 ? " rooms" : " room");
    }

    public void print() {
        System.out.println(toString());
        for (Room room : rooms) {
            room.print();
        }
    }
}
