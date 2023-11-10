package Models.Diag_Layer_Container.Variants.Variant.ECU_Variant_Patterns.ECU_Variant_Pattern.Matching_Parameters;

import Models.Diag_Layer_Container.Variants.Variant.ECU_Variant_Patterns.Matching_Parameters.Matching_Parameter.Matching_Parameter_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
 class Matching_Parameters_Model {
    private List<Matching_Parameter_Model> matchingParameter;
}
