package Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp.Compu_Method.CompuIntenalToPhys.CompuScale.CompuConst.CompuScales;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CompuScales_Model {
    @JsonProperty("LOWER-LIMIT")
    private String lowerLimit;
    @JsonProperty("UPPER-LIMIT")
    private String upperLimit;
    //@JsonProperty("COMPU-CONST")
    //private Compu_Const_Model CompuConst;


}
