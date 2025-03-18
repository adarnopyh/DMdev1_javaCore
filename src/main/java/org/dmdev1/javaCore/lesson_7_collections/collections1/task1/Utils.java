package org.dmdev1.javaCore.lesson_7_collections.collections1.task1;

import java.util.Iterator;
import java.util.List;

public final class Utils {
    private Utils() {
    }

    public static List <Chat> filterUserCount(List<Chat> list) {
        Iterator<Chat> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getUserCount() < 1000) {
                iterator.remove();
            }
        }
        return list;
    }

}
