package org.dmdev1.javaCore.lesson_10_input_output_streams.gpt;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RunnerGpt {
    public static void main(String[] args) throws IOException {

        String firstCsv = "src/main/resources/lesson10/prices.csv";
        String secondCsv = "src/main/resources/lesson10/products.csv";
        String outputCsv = "src/main/resources/lesson10/combined.csv";

        Map<String, String> priceMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(firstCsv))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    priceMap.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        List<String> mergedData = new ArrayList<>();
        mergedData.add("ID,NAME,PRICE");

        try (BufferedReader br = new BufferedReader(new FileReader(secondCsv))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String id = parts[0];
                    String name = parts[1];
                    String price = priceMap.getOrDefault(id, "N/A");
                    mergedData.add(id + "," + name + "," + price);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputCsv))) {
            for (String line : mergedData) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Finished");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
