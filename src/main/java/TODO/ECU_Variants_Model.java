package TODO;

import Models.Diag_Layer_Container.Variant.ECU_Variant_Model;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class ECU_Variants_Model {
    private List<ECU_Variant_Model> ecuVariant;
}
