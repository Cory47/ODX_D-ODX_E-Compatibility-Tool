package Models.Diag_Layer_Container.Variants.Variant.ECU_Variant_Patterns.ECU_Variant_Pattern.Matching_Parameters.Matching_Parameter.Out_Param_If_SNREF;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Out_Param_If_SNREF_Model {
    @JsonProperty("SHORT-NAME")
    private String shortName;
}
