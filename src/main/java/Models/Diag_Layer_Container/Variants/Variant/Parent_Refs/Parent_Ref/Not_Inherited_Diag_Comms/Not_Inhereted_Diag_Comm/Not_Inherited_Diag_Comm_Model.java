package Models.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Diag_Comms.Not_Inhereted_Diag_Comm;

import Models.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Diag_Comms.Not_Inhereted_Diag_Comm.Diag_Comm_SNREF.Diag_Comm_SNREF_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Not_Inherited_Diag_Comm_Model {
    @JsonProperty("DIAG-COMM-SNREF")
    private List<Diag_Comm_SNREF_Model> diagCommSNREF;
}
