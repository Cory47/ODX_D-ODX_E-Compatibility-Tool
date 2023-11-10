package Models.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.Structures.Params;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Param_Model {
    @JsonProperty("SEMANTIC")
    private String semantic;
    @JsonProperty("TYPE")
    private String type;
    @JsonProperty("SHORT-NAME")
    private String shortName;
    @JsonProperty("LONG-NAME")
    private String longName;
    @JsonProperty("BYTE-POSITION")
    private String bytePosition;
    @JsonProperty("CODED-VALUE")
    private String codedValue;
    @JsonProperty("DIAG-CODED-TYPE")
    private String diagCodedType;
    @JsonProperty("DOP-REF")
    private String DOP_REF;
    @JsonProperty("ID-REF")
    private String ID_REF;
    //TODO: Insert the DATA_OBJECT_PROP model matching the ID_REF from the base Variant
    //private Data_Object_Prop_Model DOP;
}



