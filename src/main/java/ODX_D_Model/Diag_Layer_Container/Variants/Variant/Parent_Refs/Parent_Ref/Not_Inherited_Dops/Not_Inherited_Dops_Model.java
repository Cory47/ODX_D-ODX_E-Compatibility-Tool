package ODX_D_Model.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Dops;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Dops.Not_Inherited_Dop.Not_Inherited_Dop_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor

public class Not_Inherited_Dops_Model {
    @JsonProperty("NOT-INHERITED-DOP")
    private List<Not_Inherited_Dop_Model> notInheritedDopModel;
}
