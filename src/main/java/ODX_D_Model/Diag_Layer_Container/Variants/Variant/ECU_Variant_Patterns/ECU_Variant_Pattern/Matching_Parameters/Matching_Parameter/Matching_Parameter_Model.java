package ODX_D_Model.Diag_Layer_Container.Variants.Variant.ECU_Variant_Patterns.ECU_Variant_Pattern.Matching_Parameters.Matching_Parameter;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Diag_Comms.Not_Inhereted_Diag_Comm.Diag_Comm_SNREF.Diag_Comm_SNREF_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Matching_Parameter_Model {
    @JsonProperty("DIAG-COMM-SNREF")
    private List<Diag_Comm_SNREF_Model> diagCommSNREFModel;
}
