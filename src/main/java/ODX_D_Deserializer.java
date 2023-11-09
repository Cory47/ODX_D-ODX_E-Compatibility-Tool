import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class ODX_D_Deserializer {

    private static final String FILE_PATH = "src/main/resources/RDF03T_04.02.60.odx-d";
    private static final String PARAM_TAG = "PARAM";
    private static final String DATA_OBJECT_TAG = "DATA-OBJECT-PROP";

    public static void main(String[] args) throws IOException, SAXException,
            ParserConfigurationException {

        ObjectMapper mapper = new ObjectMapper();
        File file = new File(FILE_PATH);

        Parse_Param(mapper, file);
        Parse_Data_Object_Prop(mapper,file);


        }

    private static void Parse_Param(ObjectMapper mapper, File file) throws IOException, ParserConfigurationException, SAXException {
        //Generate Document
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(false);
        factory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);

        // Retrieve all PARAM elements
        NodeList paramList = doc.getElementsByTagName(PARAM_TAG);

        for (int i = 0; i < paramList.getLength(); i++) {
            Element paramElement = (Element) paramList.item(i);

            String semantic = paramElement.getAttribute("SEMANTIC");
            String shortName = getTagValue("SHORT-NAME", paramElement);
            String longName = getTagValue("LONG-NAME", paramElement);
            String bytePosition = getTagValue("BYTE-POSITION", paramElement);
            String codedValue = getTagValue("CODED-VALUE", paramElement);

            ODX_D_Parameter_Model parameterModel = ODX_D_Parameter_Model.builder()
                    .semantic(semantic)
                    .shortName(shortName)
                    .longName(longName)
                    .bytePosition(bytePosition)
                    .codedValue(codedValue).build();

            //Convert object to JSON string and pretty print
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(parameterModel);

            //System.out.println(jsonString);
            //System.out.println("----------------------------");
        }
    }

    private static void Parse_Data_Object_Prop(ObjectMapper mapper, File file) throws ParserConfigurationException, IOException, SAXException {
        //Generate Document
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(false);
        factory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);

        // Retrieve all DATA-OBJECT_PROP elements
        NodeList dataObjectProp = doc.getElementsByTagName(DATA_OBJECT_TAG);

        for (int i = 0; i < dataObjectProp.getLength(); i++) {
            Element DataObjectPropEl = (Element) dataObjectProp.item(i);

            String ID = DataObjectPropEl.getAttribute("ID");
            String shortName = getTagValue("SHORT-NAME", DataObjectPropEl);
            String longName = getTagValue("LONG-NAME", DataObjectPropEl);
            String pData = getDescPData(DataObjectPropEl);
            String category = getTagValue("CATEGORY", DataObjectPropEl);



            Data_Object_Prop_Model parameterModel = Data_Object_Prop_Model.builder()
                    .ID(ID)
                    .shortName(shortName)
                    .longName(longName)
                    .Desc(pData)
                    .Category(category)
                    .build();

            //Convert object to JSON string and pretty print
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(parameterModel);

            System.out.println(jsonString);
            // Extract COMPU-SCALE data within COMPU-SCALES
            NodeList compuScaleList = DataObjectPropEl.getElementsByTagName("COMPU-SCALE");
            for (int j = 0; j < compuScaleList.getLength(); j++) {
                Element compuScaleElement = (Element) compuScaleList.item(j);

                String lowerLimit = getTagValue("LOWER-LIMIT", compuScaleElement);
                String upperLimit = getTagValue("UPPER-LIMIT", compuScaleElement);
                // Extract other COMPU-SCALE data as needed

                // Create a Compu_Scale_Model for each COMPU-SCALE entry
                CompuScales_Model compuScaleModel = CompuScales_Model.builder()
                        .LowerLimit(lowerLimit)
                        .UpperLimit(upperLimit)
                        .build();

                // Convert object to JSON string and pretty print
                jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(compuScaleModel);

                System.out.println(jsonString);
            }

            System.out.println("----------------------------");
        }
    }

    private static String getDescPData(Element dataObjectPropEl) {
        Element descElement = (Element) dataObjectPropEl.getElementsByTagName("DESC").item(0);
        if (descElement != null) {
            Element pElement = (Element) descElement.getElementsByTagName("p").item(0);
            return pElement != null ? pElement.getTextContent() : "";
        } else {
            return "";
        }
    }








    private static String getTagValue(String tag, Element element) {
        return Optional.of(element.getElementsByTagName(tag))
                .filter(nodeList -> nodeList.getLength() > 0)
                .map(nodeList -> (Element) nodeList.item(0))
                .map(Node::getChildNodes)
                .filter(childNodes -> childNodes.getLength() > 0)
                .map(childNodes -> childNodes.item(0).getNodeValue())
                .orElse(null);
    }
}

