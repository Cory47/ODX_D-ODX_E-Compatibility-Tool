import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Pos_Response_Model {
    private String ID;
    private String shortName;
    private String longName;
    private List<ODX_D_Parameter_Model> parameters;
}
