package Models.Diag_Layer_Container.Variants.Variant.ECU_Variant_Patterns.Matching_Parameters.Matching_Parameter;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Matching_Parameter_Model {
    @JsonProperty("EXPECTED-VALUE")
    private int expectedValue;
    @JsonProperty("DIAG-COMM-SNREF-SHORT-NAME")
    private String diagCommSNREFShortName;
    @JsonProperty("OUT-PARAM-IF-SNREF-SHORT-NAME")
    private String outParamIfSNREFShortName;
}
