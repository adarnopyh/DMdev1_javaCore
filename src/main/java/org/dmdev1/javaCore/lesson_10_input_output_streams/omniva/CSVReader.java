package org.dmdev1.javaCore.lesson_10_input_output_streams.omniva;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;


public class CSVReader {
    public static void main(String[] args) throws IOException {
        File file = Paths.get("src", "main", "resources", "lesson10", "omniva", "locations.csv").toFile();

        try (InputStream inputStream = new FileInputStream(file);
             PushbackInputStream pushbackStream = new PushbackInputStream(inputStream, 3);
             Reader reader = new InputStreamReader(pushbackStream, StandardCharsets.UTF_8)) {

            byte[] bom = new byte[3];
            int read = pushbackStream.read(bom);
            if (!(bom[0] == (byte) 0xEF && bom[1] == (byte) 0xBB && bom[2] == (byte) 0xBF)) {
                pushbackStream.unread(bom, 0, read);
            }

            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withDelimiter(';')
                    .withQuote('"')
                    .withFirstRecordAsHeader()
                    .parse(reader);

            int count = 0;
            for (CSVRecord record : records) {

                if (!"LV".equals(record.get("A0_NAME"))) {
                    continue;
                } else {
                 count++;
                }

                String[] columns = {
                        "ZIP", "NAME", "TYPE", "A0_NAME", "A1_NAME", "A2_NAME", "A3_NAME", "A4_NAME",
                        "A5_NAME", "A6_NAME", "A7_NAME", "A8_NAME", "X_COORDINATE", "Y_COORDINATE",
                        "SERVICE_HOURS", "TEMP_SERVICE_HOURS", "TEMP_SERVICE_HOURS_UNTIL","TEMP_SERVICE_HOURS_2",
                        "TEMP_SERVICE_HOURS_2_UNTIL", "comment_est", "comment_eng", "comment_rus",
                        "comment_lav", "comment_lit", "MODIFIED"
                };

                for (String column : columns) {
                    System.out.println(column + ": " + record.get(column));
                }
                System.out.println("---------------------------------------");
            }
            System.out.println("pakomat number is:" + count);


        }

    }
}