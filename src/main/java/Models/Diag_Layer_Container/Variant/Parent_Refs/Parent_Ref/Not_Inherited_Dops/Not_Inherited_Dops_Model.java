package Models.Diag_Layer_Container.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Dops;

import Models.Diag_Layer_Container.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Dops.Not_Inherited_Dop.Not_Inherited_Dop_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder

public class Not_Inherited_Dops_Model {
    private List<Not_Inherited_Dop_Model> notInheritedDopModel;
}
