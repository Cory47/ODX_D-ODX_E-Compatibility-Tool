package Models.Diag_Layer_Container.Variant.ECU_Variant_Patterns.Matching_Parameters;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Matching_Parameter_Model {
    private int expectedValue;
    private String diagCommSNREFShortName;
    private String outParamIfSNREFShortName;
}
