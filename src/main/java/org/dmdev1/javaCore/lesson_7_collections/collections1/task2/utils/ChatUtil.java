package org.dmdev1.javaCore.lesson_7_collections.collections1.task2.utils;

import org.dmdev1.javaCore.lesson_7_collections.collections1.task2.Chat;
import org.dmdev1.javaCore.lesson_7_collections.collections1.task2.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ChatUtil {

    private ChatUtil() {
        throw new UnsupportedOperationException("Utility class ChatUtil");
    }

    public static List<User> getAllUsersFromChats(int minAge, List<Chat> chats) {
        Set<User> users = new HashSet<>();
        for (Chat chat : chats) {
            for (User user : chat.getUsers()) {
                if (user.getAge() >= minAge) {
                    users.add(user);
                }
            }
        }
        return new ArrayList<>(users);
    }
}
