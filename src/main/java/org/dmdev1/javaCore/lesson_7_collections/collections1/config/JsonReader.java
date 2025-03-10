package org.dmdev1.javaCore.lesson_7_collections.collections1.config;

import com.fasterxml.jackson.core.type.TypeReference;
import org.dmdev1.javaCore.lesson_7_collections.collections1.task2.Chat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

public class JsonReader {
    public static List<Chat> readChatsFromJson(String fileName) {
        ObjectMapper objectMapper = new ObjectMapper();
        try (InputStream inputStream = JsonReader.class.getClassLoader().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new RuntimeException("File not found: " + fileName);
            }
            return objectMapper.readValue(inputStream, new TypeReference<List<Chat>>() {});
        } catch (Exception e) {
            throw new RuntimeException("Error reading JSON file", e);
        }
    }
}
