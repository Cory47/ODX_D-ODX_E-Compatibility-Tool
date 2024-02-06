package ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp.Compu_Method.CompuIntenalToPhys;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp.Compu_Method.CompuIntenalToPhys.CompuScales.CompuScales_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Compu_Internal_To_Phys {
    @JsonProperty("COMPU-SCALES")
    List<CompuScales_Model> CompuScales;
}
