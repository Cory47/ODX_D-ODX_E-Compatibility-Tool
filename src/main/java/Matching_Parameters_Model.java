import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
 class Matching_Parameters_Model {
    private List<Matching_Parameter_Model> matchingParameter;
}
