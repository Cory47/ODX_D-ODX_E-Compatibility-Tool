package ODX_D_Model.Diag_Layer_Container.Variants.Variant.ECU_Variant_Patterns.ECU_Variant_Pattern;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.ECU_Variant_Patterns.Matching_Parameters.Matching_Parameter.Matching_Parameter_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ECU_Variant_Pattern_Model {
    @JsonProperty("MATCHING-PARAMETERS")
    private List<Matching_Parameter_Model> matchingParameter;
}
