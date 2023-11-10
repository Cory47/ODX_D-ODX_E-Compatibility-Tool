package Models.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Diag_Comms.Not_Inhereted_Diag_Comm.Diag_Comm_SNREF;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Diag_Comm_SNREF_Model {
    @JsonProperty("SHORT-NAME")
    private String shortName;
}
