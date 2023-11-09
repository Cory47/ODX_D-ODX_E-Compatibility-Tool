import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompuScales_Model {
    private String LowerLimit;
    private String UpperLimit;
    private String CompuConst;
}
