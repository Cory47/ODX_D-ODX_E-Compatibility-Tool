package Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProp;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Data_Object_Prop_Model {
    private String id;
    private String shortName;
    private String longName;
    //private Compu_Method_Model compuMethod;
    //private Diag_Coded_Type_Model diagCodedType;
    //private Physical_Type_Model physicalType;
    //private Internal_Constructor_Model internalConstructor;
}
