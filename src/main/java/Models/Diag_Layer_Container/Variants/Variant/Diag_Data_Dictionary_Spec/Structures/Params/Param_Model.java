package Models.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.Structures.Params;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Param_Model {
    private String semantic;
    private String type;
    private String shortName;
    private String longName;
    private String bytePosition;
    private String codedValue;
    private String diagCodedType;
    private String DOP_REF;
    private String ID_REF;
    //TODO: Insert the DATA_OBJECT_PROP model matching the ID_REF from the base Variant
    //private Data_Object_Prop_Model DOP;
}



