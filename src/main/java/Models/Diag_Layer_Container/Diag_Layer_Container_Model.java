package Models.Diag_Layer_Container;

import Models.Diag_Layer_Container.Variants.Variant.ECU_Variant_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class Diag_Layer_Container_Model {
    @JsonProperty("BASE-VARIANTS")
    private List<ECU_Variant_Model> BaseVariant;
    @JsonProperty("ECU-VARIANTS")
    private List<ECU_Variant_Model> ECUVariants;
}
