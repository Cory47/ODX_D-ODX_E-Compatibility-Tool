package Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps;

import Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.DataObjectProps.DataObjectProp.Data_Object_Prop_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class Data_Object_Props_Model {
    @JsonProperty("DATA-OBJECT-PROP")
    List<Data_Object_Prop_Model> dataObjectProp;
}
