package Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProp.Compu_Scales;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompuScales_Model {
    private String LowerLimit;
    private String UpperLimit;
    private String CompuConst;
}
