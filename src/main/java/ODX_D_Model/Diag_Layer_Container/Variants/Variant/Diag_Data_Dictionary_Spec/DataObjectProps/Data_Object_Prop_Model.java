package ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.DataObjectProps;

import ODX_D_Model.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.InternalConst.Internal_Const_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp.Compu_Method.Compu_Method_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DiagCodedTypeModel.Diag_Coded_Type_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.PhysicalType.Physical_Type_Model;
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
    @JsonProperty("DIAG-CODED-TYPE")
    private Diag_Coded_Type_Model diagCodedType;
    @JsonProperty("PHYSICAL-TYPE")
    private Physical_Type_Model physicalType;
    @JsonProperty("INTERNAL-CONSTR")
    private Internal_Const_Model internalConst;

}
