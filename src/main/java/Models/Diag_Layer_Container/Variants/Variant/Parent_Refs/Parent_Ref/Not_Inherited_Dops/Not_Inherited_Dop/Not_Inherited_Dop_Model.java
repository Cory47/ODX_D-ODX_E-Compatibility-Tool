package Models.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Dops.Not_Inherited_Dop;

import Models.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Dops.Not_Inherited_Dop.Dop_Base_SNREF.Dop_Base_SNREF_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Not_Inherited_Dop_Model {
    @JsonProperty("DOP-BASE-SNREF")
    private List<Dop_Base_SNREF_Model> dopBaseSNREF;
}
