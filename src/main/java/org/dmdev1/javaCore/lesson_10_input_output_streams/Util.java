package org.dmdev1.javaCore.lesson_10_input_output_streams;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Util {
    private Util() {
    }

    public static Map<String, String> readPrices(File pricesCsv) throws IOException{
        Map<String, String> priceMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pricesCsv))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    priceMap.put(parts[0], parts[1]);
                }
            }
        }
        return priceMap;
    }

    public static List<String> mergeProductsWithPrices(File productsCsv, Map<String, String> priceMap) throws IOException {
        List<String> mergedData = new ArrayList<>();
        mergedData.add("ID,NAME,PRICE");

        try (BufferedReader br = new BufferedReader(new FileReader(productsCsv))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String id = parts[0];
                    String name = parts[1];
                    String price = priceMap.getOrDefault(id, "N/A");
                    mergedData.add(String.join(",", id, name, price));
                }
            }
        }
        return mergedData;
    }


    public static void writeToFile(File file, List<String> data)  throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
        }
    }

}
