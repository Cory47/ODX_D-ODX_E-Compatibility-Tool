package Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DiagCodedTypeModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Diag_Coded_Type_Model {
    @JsonProperty("BASE-TYPE-ENCODING")
    private String baseTypeEncode;
    @JsonProperty("BASE-DATA-TYPE")
    private String baseTypData;
    @JsonProperty("type")
    private String xsiType;
    @JsonProperty("TERMINATION")
    private String termination;
    @JsonProperty("BIT-LENGTH")
    private String bitLength;
}

