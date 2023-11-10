import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class Diag_Code_Model {
    private String EncodeType;
    private String DataType;
    private String Termination;
    private String XsiType;
}
