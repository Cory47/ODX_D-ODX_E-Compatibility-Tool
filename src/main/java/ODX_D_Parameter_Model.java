import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ODX_D_Parameter_Model {
    private String semantic;
    private String shortName;
    private String longName;
    private String bytePosition;
    private String codedValue;
    private String diagCodedType;
}



