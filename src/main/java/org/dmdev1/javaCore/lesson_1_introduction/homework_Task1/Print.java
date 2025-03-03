package org.dmdev1.javaCore.lesson_1_introduction.homework_Task1;

import org.dmdev1.javaCore.lesson_1_introduction.homework_Task1.objects.Apartment;
import org.dmdev1.javaCore.lesson_1_introduction.homework_Task1.objects.Floor;
import org.dmdev1.javaCore.lesson_1_introduction.homework_Task1.objects.House;
import org.dmdev1.javaCore.lesson_1_introduction.homework_Task1.objects.Room;

public class Print {
    public static void main(String[] args) {

        Room room1 = new Room(false);
        Room room2 = new Room(true);
        Room room3 = new Room(false);
        Apartment apartment1 = new Apartment(1, new Room[]{room2, room3});
        Apartment apartment2 = new Apartment(2, new Room[]{room1, room2, room3});
        Apartment apartment3 = new Apartment(3, new Room[]{room1});
        Floor floor1 = new Floor(5, new Apartment[]{apartment1, apartment2, apartment3});
        House house1 = new House(1, new Floor[]{floor1});

        house1.print();
    }
}
