package TODO;

import Models.Diag_Layer_Container.Variant.ECU_Variant_Patterns.ECU_Variant_Pattern_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
class ECU_Variant_Patterns_Model {
    private List<ECU_Variant_Pattern_Model> ecuVariantPattern;
}
