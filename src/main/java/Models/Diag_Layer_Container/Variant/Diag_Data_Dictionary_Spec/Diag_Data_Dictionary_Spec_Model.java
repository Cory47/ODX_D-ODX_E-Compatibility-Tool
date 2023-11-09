package Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec;

import Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProp.Data_Object_Prop_Model;
import Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.Structures.Structure_Model;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Diag_Data_Dictionary_Spec_Model {
    List<Data_Object_Prop_Model> dataObjectProps;
    List<Structure_Model> Structures;
    /*private String id;
    private String shortName;
    private String longName;
    private String compuMethod;
    private String category;
    private String compuInternalToPhys;
    private String compuScale;
    private String lowerLimit;
    private String upperLimit;
    private String compuConst;
    private String VT;
    private String diagCodedTypeBaseDataType;
    private String bitLength;
    private String physicalTypeBaseDataType;
    private String internalConstr;
    private String scaleConstrValidity;
    private String lowerLimitSCV;
    private String upperLimitSCV;*/
}
