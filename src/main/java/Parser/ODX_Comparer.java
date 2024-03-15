/*
 * ODX_Comparer.java
 * This class is responsible for comparing ODX-D and ODX-E models and writing comparison results to a CSV file.
 * It extracts short names from JSON objects representing ODX-D and ODX-E models, identifies common short names,
 * and determines short names exclusive to each model. The comparison results are then written to a CSV file
 * with sections for common short names, short names exclusive to ODX-D, and short names exclusive to ODX-E.
 */

package Parser;

import ODX_D_Model.ODX_D_Model;
import ODX_E_Model.ODX_E_Model;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.IOException;
import java.util.*;

public class ODX_Comparer {

    //List of short names common to both ODX-D and ODX-E
    List<String> matches;
    //List of short names only in ODX-D
    List<String> onlyODXD;
    //List of short names only in ODX-E
    List<String> onlyODXE;

    //Get the user's home directory
    public String userHome = System.getProperty("user.home");
    //Specify the output path on the user's desktop
    public String desktopPath = userHome + File.separator + "Desktop" + File.separator + "ODXComparer.csv";

    //Method to compare ODX models and write comparison results to a CSV file
    public void compareODXModels(String odxD, String odxE, String desktopPath) throws IOException {
        //Loop through odxD and store each short name field in a hashmap
        JSONObject odxDObject = new JSONObject(odxD);
        JSONObject odxEObject = new JSONObject(odxE);

        //Extract short name values from JSON objects
        List<String> shortNameODXD = getValuesInObject(odxDObject, "SHORT-NAME");
        List<String> shortNameODXE = getValuesInObject(odxEObject, "SHORT-NAME");

        //Convert ODX-E short names to a set for efficient comparison
        Set<String> odxEShortNameSet = new HashSet<>(shortNameODXE);

        // Handles null exception error
        if (matches == null) {
            matches = new ArrayList<>();
        } else {
            //Clear the matches list if not null
            matches.clear();
        }

        // Loop through short names in odxD and add matches to list
        for (String shortName : shortNameODXD) {
            if (odxEShortNameSet.contains(shortName)) {
                matches.add(shortName);
            }
        }

//        System.out.println(Arrays.toString(shortNameODXD.toArray()));
//        System.out.println(Arrays.toString(shortNameODXE.toArray()));
        //Get parameters only in ODX-D and ODX-E
        onlyODXD = getOnlyODXDParams(shortNameODXE, shortNameODXD);
        onlyODXE = getOnlyODXEParams(shortNameODXD, shortNameODXE);

        //System.out.println(Arrays.toString(matches.toArray()));
        //Write comparison results to the CSV file
        try (FileWriter writer = new FileWriter(desktopPath)) {
            //Write column header "ODX-D and ODX-E matches"
            writer.write("ODX-D and ODX-E matches:\n");
            //Write parameters in both ODX-D and ODX-E
            writer.write(matches + "\n");
            //Write column header "Only in ODX-D"
            writer.write("\nOnly in ODX-D:\n");
            //Write parameters only in ODX-D
            writer.write(Arrays.toString(onlyODXD.toArray()) + "\n");
            //Write column header "Only in ODX-E"
            writer.write("\nOnly in ODX-E:\n");
            //Write parameters only in ODX-E
            writer.write(Arrays.toString(onlyODXE.toArray()) + "\n");
        }
    }

    //Method to get parameters only in ODX-D
    public List<String> getOnlyODXDParams(List<String> odxEList, List<String> odxDList) {
        List<String> odxDParams = new ArrayList<>(odxDList);
        odxDParams.removeAll(odxEList);
        //System.out.println(Arrays.toString(odxDParams.toArray()));
        return odxDParams;
    }

    //Method to get parameters only in ODX-E
    public List<String> getOnlyODXEParams(List<String> odxDList, List<String> odxEList) {
        List<String> odxEParams = new ArrayList<>(odxEList);
        odxEParams.removeAll(odxDList);
        //System.out.println(Arrays.toString(odxEParams.toArray()));
        return odxEParams;
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
