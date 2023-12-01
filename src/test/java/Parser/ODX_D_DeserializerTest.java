package Parser;

import Models.Diag_Layer_Container.Diag_Layer_Container_Model;
import Models.ODX_Model;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ODX_D_DeserializerTest {
    private static final String ODX_D_FILE_PATH = "src/main/resources/Test.odx-d";
    private static final String TEST_FILE_PATH = "src/main/resources/Test.json";
    private static final String TEST_OUTPUT_FILE_PATH = "src/main/resources/TestOutput.json";
    private ODX_D_Deserializer deserializer;

    @Test
    void testDeserializeODX() throws IOException {
        deserializer = new ODX_D_Deserializer();
        ODX_Model actualOutput = deserializer.deserializeODX(ODX_D_FILE_PATH);
        ODX_Model expectedOutput =  new ODX_Model();
        Diag_Layer_Container_Model diagLayerContainerModel = new Diag_Layer_Container_Model();
        expectedOutput.setDiagLayerContainer(diagLayerContainerModel);
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    void testSerializeToJson() throws IOException {
        ODX_Model input =  new ODX_Model();
        Diag_Layer_Container_Model diagLayerContainerModel = new Diag_Layer_Container_Model();
        input.setDiagLayerContainer(diagLayerContainerModel);
        deserializer = new ODX_D_Deserializer();
        String actualOutput = deserializer.serializeToJson(input);
        String expectedOutput = Files.readString(Paths.get(TEST_FILE_PATH));
        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    void testWriteToFile() throws IOException {
        ODX_Model input =  new ODX_Model();
        Diag_Layer_Container_Model diagLayerContainerModel = new Diag_Layer_Container_Model();
        input.setDiagLayerContainer(diagLayerContainerModel);
        deserializer = new ODX_D_Deserializer();
        deserializer.writeToFile(input, TEST_OUTPUT_FILE_PATH);
        String actualOutput = Files.readString(Paths.get(TEST_OUTPUT_FILE_PATH));
        String expectedOutput = Files.readString(Paths.get(TEST_FILE_PATH));
        assertEquals(actualOutput, expectedOutput);
    }
}
