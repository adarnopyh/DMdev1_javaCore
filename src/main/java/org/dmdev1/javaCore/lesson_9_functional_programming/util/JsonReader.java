package org.dmdev1.javaCore.lesson_9_functional_programming.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.dmdev1.javaCore.lesson_9_functional_programming.dto.Student;

import java.io.InputStream;
import java.util.List;

public final class JsonReader {

    private JsonReader() {
    }

    public static List<Student> readStudentsFromJson(String fileName) {
            ObjectMapper objectMapper = new ObjectMapper();
            try (InputStream inputStream = org.dmdev1.javaCore.lesson_7_collections.collections1.config.JsonReader.class.getClassLoader().getResourceAsStream(fileName)) {
                if (inputStream == null) {
                    throw new RuntimeException("File not found: " + fileName);
                }
                return objectMapper.readValue(inputStream, new TypeReference<List<Student>>() {});
            } catch (Exception e) {
                throw new RuntimeException("Error reading JSON file", e);
            }
        }
}
