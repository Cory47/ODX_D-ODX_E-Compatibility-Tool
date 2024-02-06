package ODX_D_Model.Diag_Layer_Container.Variants.Variant.ECU_Variant_Patterns;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.ECU_Variant_Patterns.ECU_Variant_Pattern.ECU_Variant_Pattern_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
class ECU_Variant_Patterns_Model {
    @JsonProperty("ECU-VARIANT-PATTERNS")
    private List<ECU_Variant_Pattern_Model> ecuVariantPattern;
}
