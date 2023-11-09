package Parser;

import Models.ODX_Model;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ODX_D_Deserializer {
    private static final String FILE_PATH = "src/main/resources/RDF03T_04.02.60.odx-d";
    private final XmlMapper xmlMapper;
    private final ObjectMapper mapper;

    public ODX_D_Deserializer() {
        mapper = new ObjectMapper();
        xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static void main(String[] args) {
        try {
            ODX_D_Deserializer deserializer = new ODX_D_Deserializer();
            ODX_Model odxModel = deserializer.deserializeODX(FILE_PATH);
            //TODO: Any Transformations to the JSON will be performed here
            String jsonString = deserializer.serializeToJson(odxModel);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ODX_Model deserializeODX(String filePath) throws IOException {
        String xmlContent = Files.readString(Paths.get(filePath));
        return xmlMapper.readValue(xmlContent, ODX_Model.class);
    }

    public String serializeToJson(ODX_Model model) throws IOException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(model);
    }
}

