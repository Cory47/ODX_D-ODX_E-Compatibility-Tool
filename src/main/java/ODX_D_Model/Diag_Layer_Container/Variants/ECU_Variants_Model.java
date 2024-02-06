package ODX_D_Model.Diag_Layer_Container.Variants;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.ECU_Variant_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ECU_Variants_Model {
    @JsonProperty("ECU-VARIANT")
    private List<ECU_Variant_Model> ecuVariant;
}
