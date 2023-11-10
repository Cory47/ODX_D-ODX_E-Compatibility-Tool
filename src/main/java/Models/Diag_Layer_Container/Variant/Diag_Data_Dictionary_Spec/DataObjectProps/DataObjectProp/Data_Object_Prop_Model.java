package Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp;

import Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp.Compu_Method.Compu_Method_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Data_Object_Prop_Model {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("SHORT-NAME")
    private String shortName;
    @JsonProperty("LONG-NAME")
    private String longName;
    @JsonProperty("COMPU-METHOD")
    private Compu_Method_Model compuMethod;
    //private Diag_Coded_Type_Model diagCodedType;
    //private Physical_Type_Model physicalType;
    //private Internal_Constructor_Model internalConstructor;
}
