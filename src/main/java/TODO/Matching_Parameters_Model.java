package TODO;

import Models.Diag_Layer_Container.Variant.ECUVariantPatterns.Matching_Parameters.Matching_Parameter_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
 class Matching_Parameters_Model {
    private List<Matching_Parameter_Model> matchingParameter;
}
