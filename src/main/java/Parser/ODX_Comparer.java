/*
 * ODX_Comparer.java
 * This class is responsible for comparing ODX-D and ODX-E models and writing comparison results to a CSV file.
 * It extracts short names from JSON objects representing ODX-D and ODX-E models, identifies common short names,
 * and determines short names exclusive to each model. The comparison results are then written to a CSV file
 * with sections for common short names, short names exclusive to ODX-D, and short names exclusive to ODX-E.
 */

package Parser;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ODX_Comparer {
    CSVWriter csvWriter;
    //List of short names common to both ODX-D and ODX-E
    List<String> matches;
    //List of short names only in ODX-D
    List<String> onlyODXD;
    //List of short names only in ODX-E
    List<String> onlyODXE;

    public ODX_Comparer() {
        csvWriter = new CSVWriter();
    }

    //Method to compare ODX models and write comparison results to a CSV file
    public void compareODXModels(String odxD, String odxE, String outputPath) throws IOException {
        //Loop through odxD and store each short name field in a hashmap
        JSONObject odxDObject = new JSONObject(odxD);
        JSONObject odxEObject = new JSONObject(odxE);

        //Extract short name values from JSON objects
        List<String> shortNameODXD = getValuesInObject(odxDObject, "SHORT-NAME");
        List<String> shortNameODXE = getValuesInObject(odxEObject, "SHORT-NAME");

        //Add paramaters to Lists
        matches = getMatchingParams(shortNameODXD, shortNameODXE);
        onlyODXD = getOnlyODXDParams(shortNameODXD, shortNameODXE);
        onlyODXE = getOnlyODXEParams(shortNameODXD, shortNameODXE);

        //Calculate the total number of mismatches by summing the sizes of lists onlyODXD and onlyODXE
        int mismatch = getNumMismatches();

        //Calculate the total number of names by summing the sizes of lists onlyODXD, onlyODXE, and matches
        int numNames = getNumTotal();

        writeToFile(mismatch, numNames, outputPath);
    }

    //Method to get parameters only in ODX-D
    public List<String> getMatchingParams(List<String> odxDList, List<String> odxEList) {
        List<String> matches = new ArrayList<>(odxDList);
        matches.retainAll(odxEList);
        return matches;
    }

    //Method to get parameters only in ODX-D
    public List<String> getOnlyODXDParams(List<String> odxDList, List<String> odxEList) {
        List<String> odxDParams = new ArrayList<>(odxDList);
        odxDParams.removeAll(odxEList);
        return odxDParams;
    }

    //Method to get parameters only in ODX-E
    public List<String> getOnlyODXEParams(List<String> odxDList, List<String> odxEList) {
        List<String> odxEParams = new ArrayList<>(odxEList);
        odxEParams.removeAll(odxDList);
        return odxEParams;
    }

    public int getNumMatches() {
        return matches.size();
    }
    public int getNumMismatches() {
        return onlyODXD.size() + onlyODXE.size();
    }
    public int getNumTotal() {
        return matches.size() + onlyODXD.size() + onlyODXE.size();
    }

    public void writeToFile(int mismatch, int numNames, String outputPath) throws IOException {
        String filePath = String.format(outputPath, "ComparisonOutput.csv");
        //Write comparison results to the CSV file
        try (FileWriter writer = new FileWriter(filePath)) {
            //Write row header "Number of matches"
            writer.write("Number of matches:\n");
            //Write number of matches between ODX-D and ODX-E
            writer.write(matches.size() + "\n");
            //Write row header "Number of mismatches"
            writer.write("Number of mismatches:\n");
            //Write number of mismatches between ODX-D and ODX-E
            writer.write(mismatch + "\n");
            //Write row header "Total number of names in file"
            writer.write("Total number of names in file:\n");
            //Write total number of names in the file
            writer.write(numNames + "\n");

            //Write row header "ODX-D and ODX-E matches"
            writer.write("\nODX-D and ODX-E matches:\n");
            //Write parameters in both ODX-D and ODX-E
            writer.write(Arrays.toString(matches.toArray()) + "\n");
            //Write row header "Only in ODX-D"
            writer.write("\nOnly in ODX-D:\n");
            //Write parameters only in ODX-D
            writer.write(Arrays.toString(onlyODXD.toArray()) + "\n");
            //Write row header "Only in ODX-E"
            writer.write("\nOnly in ODX-E:\n");
            //Write parameters only in ODX-E
            writer.write(Arrays.toString(onlyODXE.toArray()) + "\n");
        }
    }



    //Source: https://www.baeldung.com/java-jsonobject-get-value
    //Method to extract values associated with a given key from a JSONObject
    public List<String> getValuesInObject(JSONObject jsonObject, String key) {
        List<String> accumulatedValues = new ArrayList<>();
        for (String currentKey : jsonObject.keySet()) {
            Object value = jsonObject.get(currentKey);
            if (currentKey.equals(key)) {
                accumulatedValues.add(value.toString());
            }

            if (value instanceof JSONObject) {
                accumulatedValues.addAll(getValuesInObject((JSONObject) value, key));
            } else if (value instanceof JSONArray) {
                accumulatedValues.addAll(getValuesInArray((JSONArray) value, key));
            }
        }

        return accumulatedValues;
    }

    //Source: https://www.baeldung.com/java-jsonobject-get-value
    //Method to extract values associated with a given key from a JSONArray
    public List<String> getValuesInArray(JSONArray jsonArray, String key) {
        List<String> accumulatedValues = new ArrayList<>();
        for (Object obj : jsonArray) {
            if (obj instanceof JSONArray) {
                accumulatedValues.addAll(getValuesInArray((JSONArray) obj, key));
            } else if (obj instanceof JSONObject) {
                accumulatedValues.addAll(getValuesInObject((JSONObject) obj, key));
            }
        }

        return accumulatedValues;
    }
}
