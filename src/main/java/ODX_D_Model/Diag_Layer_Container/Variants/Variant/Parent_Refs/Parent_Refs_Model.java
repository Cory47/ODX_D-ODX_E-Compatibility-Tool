package ODX_D_Model.Diag_Layer_Container.Variants.Variant.Parent_Refs;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Parent_Ref_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Parent_Refs_Model {
    @JsonProperty("PARENT-REF")
    private List<Parent_Ref_Model> parentRefModel;
}
