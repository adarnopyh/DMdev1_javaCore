package org.dmdev1.javaCore.lesson_7_collections.collections1.task1;

public class Chat implements Comparable<Chat> {
    private String name;
    private int userCount;

    public Chat(String name, int userCount) {
        this.name = name;
        this.userCount = userCount;
    }

    public String getName() {
        return name;
    }

    public int getUserCount() {
        return userCount;
    }

    @Override
    public String toString() {
        return "Chat{name='" + name + "'; userCount=" + userCount + "}";
    }

    @Override
    public int compareTo(Chat o) {
        if (userCount == o.getUserCount()) {
            return name.compareTo(o.getName());
        }
        if (userCount < o.getUserCount()) {
            return 1;
        }
        return -1;
    }
}
