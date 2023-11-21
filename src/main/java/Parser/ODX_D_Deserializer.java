package Parser;

import Models.ODX_Model;
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
    private static final String FILE_PATH = "src/main/resources/RDF03T_04.02.60.odx-d";
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
       /* try {
            ODX_D_Deserializer deserializer = new ODX_D_Deserializer();
            ODX_Model odxModel = deserializer.deserializeODX(FILE_PATH);
            //TODO: Any transformations to the JSON will be performed here
            deserializer.writeToFile(odxModel);
            String jsonString = deserializer.serializeToJson(odxModel);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public ODX_Model deserializeODX(String filePath) throws IOException {
        String xmlContent = Files.readString(Paths.get(filePath));
        return xmlMapper.readValue(xmlContent, ODX_Model.class);
    }

    public String serializeToJson(ODX_Model model) throws IOException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(model);
    }

    public void writeToFile(ODX_Model model) throws IOException {
        writer.writeValue(new File("src/main/java/Output/output.json"), model);
    }
}

