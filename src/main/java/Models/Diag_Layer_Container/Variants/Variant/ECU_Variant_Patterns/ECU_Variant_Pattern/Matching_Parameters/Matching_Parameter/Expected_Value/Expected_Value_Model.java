package Models.Diag_Layer_Container.Variants.Variant.ECU_Variant_Patterns.ECU_Variant_Pattern.Matching_Parameters.Matching_Parameter.Expected_Value;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Expected_Value_Model {
    @JsonProperty("EXPECTED-VALUE")
    private String expectedValue;
}
