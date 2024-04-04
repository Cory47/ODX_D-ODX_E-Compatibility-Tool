package Parser;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {

    private static final String OUTPUT_FILEPATH = "src/main/java/Output/comparison.csv";

    public void writeValues(List<String> matches, List<String> odxDOnly, List<String> odxEOnly, String outputPath) throws IOException {
        // First line of the CSV should be formatted like this:
        //"Short-Name", "ODX-D", "ODX-E", "Part Number"

        // Start with the CSV header
        StringBuilder csvOutput = new StringBuilder("Short-Name,ODX-D,ODX-E\n");

        // Assuming all lists are of the same length for simplicity
        for (int i = 0; i < matches.size(); i++) {
            csvOutput.append(matches.get(i)).append(",X,X\n");
        }
        for (int i = 0; i < odxDOnly.size(); i++) {
            csvOutput.append(odxDOnly.get(i)).append(",X,N/A\n");
        }
        for (int i = 0; i < odxEOnly.size(); i++) {
            csvOutput.append(odxEOnly.get(i)).append(",N/A,X\n");
        }

        String filePath = String.format(outputPath, "ComparisonOutput.csv");
        //Write comparison results to the CSV file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(csvOutput.toString());
        }
    }
}
