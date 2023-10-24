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

public class Parser {

    private static final String FILE_PATH = "src/main/resources/RDF03T_04.02.60.odx-d";
    private static final String PARAM_TAG = "PARAM";

    public static void main(String[] args) throws IOException, SAXException,
            ParserConfigurationException {

        File file = new File(FILE_PATH);

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

            System.out.println(parameterModel);
            System.out.println("----------------------------");
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

