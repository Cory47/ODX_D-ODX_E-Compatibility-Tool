package Parser;

import ODX_D_Model.ODX_D_Model;
import ODX_E_Model.ODX_E_Model;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        onlyODXE = getOnlyODXEParams(shortNameODXD, shortNameODXE);

        //System.out.println(Arrays.toString(matches.toArray()));
        //System.out.println(Arrays.toString(onlyODXD.toArray()));
        System.out.println(Arrays.toString(onlyODXE.toArray()));

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
