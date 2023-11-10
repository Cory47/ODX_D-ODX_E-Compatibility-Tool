package TODO;

import Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp.Compu_Method.CompuIntenalToPhys.CompuScale.Compu_Scale_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CompuScales_Model {
    @JsonProperty("COMPU-SCALE")
    private List<Compu_Scale_Model> CompuScale;
}
