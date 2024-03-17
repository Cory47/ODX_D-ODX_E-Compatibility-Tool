package Parser;

import java.util.List;

public class CSVWriter {

    private static final String OUTPUT_FILEPATH = "src/main/java/Output/comparison.csv";

    public void writeValues(List<String> matches, List<String> odxDOnly, List<String> odxEOnly) {
        //First line of the CSV should be formatted like this:
        //"Short-Name", "ODX-D", "ODX-E"
        //TODO: Loop through each element in the list
    }
}
