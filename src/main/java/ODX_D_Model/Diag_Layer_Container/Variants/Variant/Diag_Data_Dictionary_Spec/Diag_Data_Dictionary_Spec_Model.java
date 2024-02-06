package ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.Data_Object_Prop_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.Structures.Structure_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Diag_Data_Dictionary_Spec_Model {
    @JsonProperty("DATA-OBJECT-PROPS")
    List<Data_Object_Prop_Model> dataObjectProps;
    @JsonProperty("STRUCTURES")
    List<Structure_Model> Structures;
}
