package org.dmdev1.oop.introduction.homework_v1.controllers;

import org.dmdev1.oop.introduction.homework_v1.dto.Apartment;
import org.dmdev1.oop.introduction.homework_v1.dto.Floor;

public class Controller {
    public static void main(String[] args) {

        Floor floor = new Floor(5, new int[2]);

        System.out.println(floor.toString());
    }
}
