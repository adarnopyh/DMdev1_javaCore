package org.dmdev1.javaCore.lesson_10_input_output_streams;

import java.io.*;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import static org.dmdev1.javaCore.lesson_10_input_output_streams.Util.mergeProductsWithPrices;
import static org.dmdev1.javaCore.lesson_10_input_output_streams.Util.readPrices;
import static org.dmdev1.javaCore.lesson_10_input_output_streams.Util.writeToFile;


public class Runner {
    public static void main(String[] args) throws IOException {

        File pricesCsv = Path.of("src", "main", "resources", "lesson10", "prices.csv").toFile();
        File productsCsv = Path.of("src", "main", "resources", "lesson10", "products.csv").toFile();
        File combinedCsv = Path.of("src", "main", "resources", "lesson10", "combined.csv").toFile();

        if (!pricesCsv.exists() || !productsCsv.exists()) {
            System.out.println("One of the input files is missing. Please check.");
            return;
        }

        Map<String, String> priceMap = readPrices(pricesCsv);
        List<String> mergedData = mergeProductsWithPrices(productsCsv, priceMap);
        writeToFile(combinedCsv, mergedData);

        System.out.println("Finished merging files.");
    }

}
