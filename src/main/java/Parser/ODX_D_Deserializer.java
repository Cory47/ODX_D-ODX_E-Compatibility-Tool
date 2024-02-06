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

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
public class ODX_D_Deserializer {
    private static final String ODX_D_FILE_PATH = "src/main/resources/ICC5_Parser/ICC501T_01.01.810.odx-d";
    private static final String ODX_E_FILE_PATH = "src/main/resources/ICC5_Parser/ICC501T_VARCODE.odx-e";
    private static final String OUTPUT_PATH = "src/main/java/Output/%s-Output.json";
    private final XmlMapper xmlMapper;
    private final ObjectMapper mapper;
    private final ObjectWriter writer;

    public ODX_D_Deserializer() {
        mapper = new ObjectMapper();
        xmlMapper = new XmlMapper();
        writer = mapper.writer(new DefaultPrettyPrinter());
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static void main(String[] args) {
        SpringApplication.run(ODX_D_Deserializer.class, args);
        try {
            ODX_D_Deserializer deserializer = new ODX_D_Deserializer();
            ODX_D_Model odxDModel = deserializer.deserializeODX_D(ODX_D_FILE_PATH);
            ODX_E_Model odxEModel = deserializer.deserializeODX_E(ODX_E_FILE_PATH);
            //TODO: Any transformations to the JSON will be performed here
            deserializer.writeToFile(odxDModel, String.format(OUTPUT_PATH, "ODX-D"));
            deserializer.writeToFile(odxEModel, String.format(OUTPUT_PATH, "ODX-E"));
            String jsonString = deserializer.serializeToJson(odxDModel);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ODX_D_Model deserializeODX_D(String filePath) throws IOException {
        String xmlContent = Files.readString(Paths.get(filePath));
        return xmlMapper.readValue(xmlContent, ODX_D_Model.class);
    }

    public ODX_E_Model deserializeODX_E(String filePath) throws IOException {
        String xmlContent = Files.readString(Paths.get(filePath));
        return xmlMapper.readValue(xmlContent, ODX_E_Model.class);
    }

    public String serializeToJson(ODX_D_Model model) throws IOException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(model);
    }

    public void writeToFile(ODX_D_Model model, String filePath) throws IOException {
        writer.writeValue(new File(filePath), model);
    }
    public void writeToFile(ODX_E_Model model, String filePath) throws IOException {
        writer.writeValue(new File(filePath), model);
    }
}

