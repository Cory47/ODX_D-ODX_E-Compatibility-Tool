import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               // Generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor  // Generates a no-argument constructor
@AllArgsConstructor // Generates a constructor with all fields as arguments
@Builder
public class ODX_D_Parameter_Model {
    private String semantic;
    private String shortName;
    private String longName;
    private String bytePosition;
    private String codedValue;

    @Override
    public String toString() {
        return "ODX_D_Parameter_Model {" + "\n" +
                "  Semantic: " + semantic + "\n" +
                "  Short Name: " + shortName + "\n" +
                "  Long Name: " + longName + "\n" +
                "  Byte Position: " + bytePosition + "\n" +
                "  Coded Value: " + codedValue + "\n" +
                "}";
    }
}



