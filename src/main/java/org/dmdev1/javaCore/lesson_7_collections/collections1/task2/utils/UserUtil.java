package org.dmdev1.javaCore.lesson_7_collections.collections1.task2.utils;

import org.dmdev1.javaCore.lesson_7_collections.collections1.task2.User;

import java.util.Iterator;
import java.util.List;

public final class UserUtil {

    private UserUtil() {
        throw new UnsupportedOperationException("Utility class UserUtil");
    }

    public static int averageAgeCount(List<User> users) {
        int sum = 0;
        int count = 0;
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            sum += user.getAge();
            count++;
        }
        return (count > 0) ? sum / count : 0;
    }
}