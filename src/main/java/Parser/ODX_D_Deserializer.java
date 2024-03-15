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
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
public class ODX_D_Deserializer {
    //File paths for ODX-D and ODX-E files and output path for JSON files
    private static final String ODX_D_FILE_PATH = "src/main/resources/ICC5_Parser/ICC501T_01.01.810.odx-d";
    private static final String ODX_E_FILE_PATH = "src/main/resources/ICC5_Parser/ICC501T_VARCODE.odx-e";
    private static final String OUTPUT_PATH = "src/main/java/Output/%s-Output.json";

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
            //TODO: Any transformations to the JSON will be performed here

            //Write JSON output files
            deserializer.writeToFile(odxDModel, String.format(OUTPUT_PATH, "ODX-D"));
            deserializer.writeToFile(odxEModel, String.format(OUTPUT_PATH, "ODX-E"));

            //Serialize models to JSON strings
            String ODXDJsonString = deserializer.serializeToJson(odxDModel);
            String ODXEJsonString = deserializer.serializeToJson(odxEModel);

            //Compare ODX models
            comparer.compareODXModels(ODXDJsonString, ODXEJsonString, comparer.desktopPath);
            //System.out.println(jsonString);
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

//Handles ODX-D files
/*
@RestController
class ODX_D_Parser {
    private final XmlMapper xmlMapper;
    private final ObjectMapper mapper;

    public ODX_D_Parser() {
        mapper = new ObjectMapper();
        xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
    @PostMapping("/ODX-D")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        try {
            //Read file content and deserialize to ODX-D model
            String content = new String(file.getBytes());
            ODX_D_Parser deserializer = new ODX_D_Parser();
            ODX_D_Model odxModel = deserializer.deserializeODX(content);

            //Serialize ODX-D model to JSON string and return it in the response
            String jsonString = deserializer.serializeToJson(odxModel);
            return new ResponseEntity<>(jsonString, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception details for debugging
            return new ResponseEntity<>("Error uploading or processing the file", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Deserialize XML content to ODX-D model
    public ODX_D_Model deserializeODX(String content) throws IOException {
        return xmlMapper.readValue(content, ODX_D_Model.class);
    }

    //Serialize ODX-D model to JSON string
    public String serializeToJson(ODX_D_Model model) throws IOException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(model);
    }
}

//Handles ODX-E files
@RestController
class ODX_E_Parser {
    private final XmlMapper xmlMapper;
    private final ObjectMapper mapper;

    public ODX_E_Parser() {
        mapper = new ObjectMapper();
        xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
    // ODX-E Postman Parser
    @PostMapping("/ODX-E")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        try {
            //Read file content and deserialize to ODX-E model
            String content = new String(file.getBytes());
            ODX_E_Parser deserializer = new ODX_E_Parser();
            ODX_E_Model odxModel = deserializer.deserializeODX(content);

            //Serialize ODX-E model to JSON string and return it in the response
            String jsonString = deserializer.serializeToJson(odxModel);
            return new ResponseEntity<>(jsonString, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception details for debugging
            return new ResponseEntity<>("Error uploading or processing the file", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Deserialize XML content to ODX-E model
    public ODX_E_Model deserializeODX(String content) throws IOException {
        return xmlMapper.readValue(content, ODX_E_Model.class);
    }

    //Serialize ODX-E model to JSON string
    public String serializeToJson(ODX_E_Model model) throws IOException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(model);
    }
}

//Compare ODX-D and ODX-E files
@RestController
class compare{
    @PostMapping("/compare")
    public ResponseEntity<String> compareUpload(@RequestParam("file") MultipartFile file,@RequestParam("file") MultipartFile file2) {
        try {
            //Read file contents and perform comparison
            String content = new String(file.getBytes());
            String content2 = new String(file2.getBytes());
            return new ResponseEntity<>("Upload Successful", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception details for debugging
            return new ResponseEntity<>("Error uploading or processing the file", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
*/