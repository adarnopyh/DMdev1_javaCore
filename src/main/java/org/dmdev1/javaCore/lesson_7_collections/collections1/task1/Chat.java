package org.dmdev1.javaCore.lesson_7_collections.collections1.task1;

import java.util.Objects;

public class Chat implements Comparable<Chat> {
    private String name;
    private Integer userCount;

    public Chat(String name, Integer userCount) {
        this.name = name;
        this.userCount = userCount;
    }

    public String getName() {
        return name;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(name, chat.name) && Objects.equals(userCount, chat.userCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, userCount);
    }

}
