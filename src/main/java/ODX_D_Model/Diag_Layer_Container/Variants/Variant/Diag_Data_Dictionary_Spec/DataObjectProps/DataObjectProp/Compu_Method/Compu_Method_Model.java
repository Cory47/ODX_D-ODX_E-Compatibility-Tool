package ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp.Compu_Method;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp.Compu_Method.CompuIntenalToPhys.Compu_Internal_To_Phys;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Compu_Method_Model {
    @JsonProperty("CATEGORY")
    private String category;
    @JsonProperty("COMPU-INTERNAL-TO-PHYS")
    private Compu_Internal_To_Phys compuInternalToPhys;
}
