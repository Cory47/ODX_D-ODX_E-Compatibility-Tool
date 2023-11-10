package Models.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Dops.Not_Inherited_Dop.Dop_Base_SNREF;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Dop_Base_SNREF_Model {
    @JsonProperty("SHORT-NAME")
    private String shortName;
}
