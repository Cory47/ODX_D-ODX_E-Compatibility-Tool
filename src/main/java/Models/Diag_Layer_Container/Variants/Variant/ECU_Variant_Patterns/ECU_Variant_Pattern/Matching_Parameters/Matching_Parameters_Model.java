package Models.Diag_Layer_Container.Variants.Variant.ECU_Variant_Patterns.ECU_Variant_Pattern.Matching_Parameters;

import Models.Diag_Layer_Container.Variants.Variant.ECU_Variant_Patterns.Matching_Parameters.Matching_Parameter.Matching_Parameter_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
 class Matching_Parameters_Model {
    @JsonProperty("MATCHING-PARAMETER")
    private List<Matching_Parameter_Model> matchingParameter;
}
