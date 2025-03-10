package org.dmdev1.javaCore.lesson_7_collections.collections1.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Utils {
    private Utils() {
    }

    public static List<User> filterAdults(List<Chat> chats) {
        List<User> adultUsers = new ArrayList<>();
        for (Chat chat : chats) {
            for (User user : chat.getUsers()) {
                if (user.getAge() > 18) {
                    adultUsers.add(user);
                }
            }
        }
        return adultUsers;
    }


    public static double averageAgeCount(List<User> users) {
        if (users.isEmpty()) {
            return 0;
        }

        Iterator<User> iterator = users.iterator();
        int total = 0;

        while (iterator.hasNext()) {
            total += iterator.next().getAge();
        }

        return (double) total / users.size();
    }

    public static void print(Object print){
        System.out.println(print);
    }
}
