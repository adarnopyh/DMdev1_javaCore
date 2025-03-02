package org.dmdev1.oop_level2.oop_concepts.Task2_Space;

public interface Printable {

    default void print() {
        System.out.println(this.toString());
    }
}
