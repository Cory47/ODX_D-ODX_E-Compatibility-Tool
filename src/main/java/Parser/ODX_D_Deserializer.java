/*
 * ODX_D_Deserializer.java
 * This class is responsible for deserializing ODX-D and ODX-E files,
 * comparing their contents, and generating JSON output files.
 * It contains methods to deserialize XML files to Java objects,
 * serialize Java objects to JSON strings, and compare ODX-D and ODX-E files.
 */

package Parser;

import ODX_D_Model.ODX_D_Model;
import ODX_E_Model.ODX_E_Model;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
public class ODX_D_Deserializer {
    //File paths for ODX-D and ODX-E files and output path for JSON files
    private static final String ODX_D_FILE_PATH = "src/main/resources/ICC5_Parser/ICC501T_01.01.810.odx-d";
    private static final String ODX_E_FILE_PATH = "src/main/resources/ICC5_Parser/ICC501T_VARCODE.odx-e";
    private static final String OUTPUT_PATH = "src/main/java/Output/%s";

    //Initialize XML mapper, JSON mapper, and writer
    private final XmlMapper xmlMapper;
    private final ObjectMapper mapper;
    private final ObjectWriter writer;

    //Comparer instance for comparing ODX models
    private static ODX_Comparer comparer;

    public ODX_D_Deserializer() {
        mapper = new ObjectMapper();
        xmlMapper = new XmlMapper();
        writer = mapper.writer(new DefaultPrettyPrinter());
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        comparer = new ODX_Comparer();
    }

    public static void main(String[] args) {
        //SpringApplication.run(ODX_D_Deserializer.class, args);
        try {
            //Instantiate deserializer and deserialize ODX-D and ODX-E files
            ODX_D_Deserializer deserializer = new ODX_D_Deserializer();
            ODX_D_Model odxDModel = deserializer.deserializeODX_D(ODX_D_FILE_PATH);
            ODX_E_Model odxEModel = deserializer.deserializeODX_E(ODX_E_FILE_PATH);

            //Write JSON output files
            deserializer.writeToFile(odxDModel, String.format(OUTPUT_PATH, "ODX-D-Output.json"));
            deserializer.writeToFile(odxEModel, String.format(OUTPUT_PATH, "ODX-E-Output.json"));

            //Serialize models to JSON strings
            String ODXDJsonString = deserializer.serializeToJson(odxDModel);
            String ODXEJsonString = deserializer.serializeToJson(odxEModel);

            //Compare ODX models
            comparer.compareODXModels(ODXDJsonString, ODXEJsonString, OUTPUT_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Read XML content from file and deserialize to ODX-D model
    public ODX_D_Model deserializeODX_D(String filePath) throws IOException {
        String xmlContent = Files.readString(Paths.get(filePath));
        return xmlMapper.readValue(xmlContent, ODX_D_Model.class);
    }

    //Read XML content from file and deserialize to ODX-E model
    public ODX_E_Model deserializeODX_E(String filePath) throws IOException {
        String xmlContent = Files.readString(Paths.get(filePath));
        return xmlMapper.readValue(xmlContent, ODX_E_Model.class);
    }

    //Serialize ODX-D model to JSON string
    public String serializeToJson(ODX_D_Model model) throws IOException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(model);
    }

    //Serialize ODX-E model to JSON string
    public String serializeToJson(ODX_E_Model model) throws IOException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(model);
    }

    //Write ODX-D model to file
    public void writeToFile(ODX_D_Model model, String filePath) throws IOException {
        writer.writeValue(new File(filePath), model);
    }

    //Write ODX-E model to file
    public void writeToFile(ODX_E_Model model, String filePath) throws IOException {
        writer.writeValue(new File(filePath), model);
    }
}