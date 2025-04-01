package org.dmdev1.javaCore.lesson_7_collections.collections1.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.dmdev1.javaCore.lesson_7_collections.collections1.task1.Utils.filterUserCount;

/*
*
* Задание 1
Дан список чатов.
Каждый чат состоит из двух полей: название и количество пользователей в этом чате.

Задача:

- Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.

- Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество совпадает, то по названию в алфавитном порядке.

- Также предоставить сортировку чатов по названию по умолчанию.

* */


public class TaskRunner {
    public static void main(String[] args) {

        List <Chat> chats = new ArrayList<>();
        chats.add(new Chat("sports", 87630));
        chats.add(new Chat("c photos", 17887));
        chats.add(new Chat("specs", 9874));
        chats.add(new Chat("small Talk", 487));
        chats.add(new Chat("small Chat", 287));
        chats.add(new Chat("missed Joke", 582));
        chats.add(new Chat("xcskiing", 2984));
        chats.add(new Chat("a photos", 17887));
        chats.add(new Chat("b photos", 17887));
        chats.add(new Chat("architecture", 298736));

        System.out.println(chats);
        System.out.println(filterUserCount(chats));

        Collections.sort(chats);
        System.out.println(chats);


    }
}
