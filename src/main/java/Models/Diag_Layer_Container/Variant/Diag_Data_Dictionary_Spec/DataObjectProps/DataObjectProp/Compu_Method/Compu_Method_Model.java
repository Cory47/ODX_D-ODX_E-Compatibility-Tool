package Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp.Compu_Method;
import Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp.Compu_Method.CompuIntenalToPhys.Compu_Internal_To_Phys;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
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
