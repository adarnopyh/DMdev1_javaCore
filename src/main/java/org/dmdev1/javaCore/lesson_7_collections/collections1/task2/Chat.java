package org.dmdev1.javaCore.lesson_7_collections.collections1.task2;

import java.util.List;

public class Chat {
    private String name;
    private List<User> users;

    public Chat(){

    }

    public Chat(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", user=" + users +
                '}'+ "\n";
    }

}
