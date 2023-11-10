package Models.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.PhysicalType;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Physical_Type_Model {
    @JsonProperty("BASE-DATA-TYPE")
    private String baseDataType;
    @JsonProperty("DISPLAY-RADIX")
    private String displayRadix;
}
