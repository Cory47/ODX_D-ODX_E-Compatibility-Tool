package Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.InternalConst;

import Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.InternalConst.ScaleConstrs.Scale_Constrs_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Internal_Const_Model {
    @JsonProperty("SCALE-CONSTRS")
    List<Scale_Constrs_Model> ScaleConstrs;
}
