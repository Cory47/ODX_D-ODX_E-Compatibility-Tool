import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
class ECU_Variant_Patterns_Model {
    private List<ECU_Variant_Pattern_Model> ecuVariantPattern;
}
