package org.dmdev1.javaCore.lesson_7_collections.collections1.task2;

import org.dmdev1.javaCore.lesson_7_collections.collections1.config.JsonReader;

import java.util.ArrayList;
import java.util.List;

import static org.dmdev1.javaCore.lesson_7_collections.collections1.task2.Utils.*;

/*
Задание 2
Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет список объектов типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.

Задача:

- Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет

- С помощью итератора посчитать средний возраст всех оставшихся пользователей.
* */


public class TaskRunner {
    public static void main(String[] args) {

        List<Chat> chats = JsonReader.readChatsFromJson("users.json");
        print("Average age between adult users is: " + averageAgeCount(filterAdults(chats)));

    }
}
