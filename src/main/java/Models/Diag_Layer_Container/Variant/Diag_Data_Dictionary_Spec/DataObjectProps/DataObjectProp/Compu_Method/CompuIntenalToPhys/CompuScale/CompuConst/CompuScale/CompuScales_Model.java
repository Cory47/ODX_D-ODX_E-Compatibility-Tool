package Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp.Compu_Method.CompuIntenalToPhys.CompuScale.CompuConst.CompuScale;

import Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp.Compu_Method.CompuIntenalToPhys.CompuScale.CompuConst.Compu_Const_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompuScales_Model {
    //@JsonProperty("COMPU-SCALE")
    //private List<Compu_Scale_Model> CompuScale;
    @JsonProperty("LOWER-LIMIT")
    private String lowerLimit;
    @JsonProperty("UPPER-LIMIT")
    private String upperLimit;
    //@JsonProperty("COMPU-CONST")
    //private Compu_Const_Model CompuConst;


}
