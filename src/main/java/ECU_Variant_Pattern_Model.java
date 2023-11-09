import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
class ECU_Variant_Pattern_Model {
    private List<Matching_Parameters_Model> matchingParameters;
}
