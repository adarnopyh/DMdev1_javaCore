package org.dmdev1.javaCore.lesson_5_oop_concepts.Task2_Space;

public interface Printable {

    default void print() {
        System.out.println(this.toString());
    }

}