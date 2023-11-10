package Models.Diag_Layer_Container.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Dops.Not_Inherited_Dop;

import Models.Diag_Layer_Container.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Dops.Not_Inherited_Dop.Dop_Base_SNREF.Dop_Base_SNREF_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Not_Inherited_Dop_Model {
    private List<Dop_Base_SNREF_Model> dopBaseSNREF;
}
