package Parser;

import ODX_D_Model.ODX_D_Model;
import ODX_E_Model.ODX_E_Model;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.*;

public class ODX_Comparer {

    List<String> matches;
    List<String> onlyODXD;
    List<String> onlyODXE;

    public void compareODXModels(String odxD, String odxE) throws IOException {
        //Loop through odxD and store each short name field in a hashmap
        JSONObject odxDObject = new JSONObject(odxD);
        JSONObject odxEObject = new JSONObject(odxE);

        List<String> shortNameODXD = getValuesInObject(odxDObject, "SHORT-NAME");
        List<String> shortNameODXE = getValuesInObject(odxEObject, "SHORT-NAME");

        Set<String> odxEShortNameSet = new HashSet<>(shortNameODXE);

        // Handles null exception error
        if (matches == null) {
            matches = new ArrayList<>();
        } else {
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
        onlyODXD = getOnlyODXDParams(shortNameODXE, shortNameODXD);
        onlyODXE = getOnlyODXEParams(shortNameODXD, shortNameODXE);

        //System.out.println(Arrays.toString(matches.toArray()));
        System.out.println("ODX-D and ODX-E matches:\n" + matches);
        System.out.println("Only in ODX-D:\n" + Arrays.toString(onlyODXD.toArray()));
        System.out.println("Only in ODX-E:\n" + Arrays.toString(onlyODXE.toArray()));

    }

    public List<String> getOnlyODXDParams(List<String> odxEList, List<String> odxDList) {
        List<String> odxDParams = new ArrayList<>(odxDList);
        odxDParams.removeAll(odxEList);
        //System.out.println(Arrays.toString(odxDParams.toArray()));
        return odxDParams;
    }

    public List<String> getOnlyODXEParams(List<String> odxDList, List<String> odxEList) {
        List<String> odxEParams = new ArrayList<>(odxEList);
        odxEParams.removeAll(odxDList);
        //System.out.println(Arrays.toString(odxEParams.toArray()));
        return odxEParams;
    }

    //Source: https://www.baeldung.com/java-jsonobject-get-value
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
