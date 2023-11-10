package Models.Diag_Layer_Container.Variant.ECU_Variant_Patterns.ECU_Variant_Pattern.Matching_Parameters.Matching_Parameter;

import Models.Diag_Layer_Container.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Diag_Comms.Not_Inhereted_Diag_Comm.Diag_Comm_SNREF.Diag_Comm_SNREF_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Matching_Parameter_Model {
    private List<Diag_Comm_SNREF_Model> diagCommSNREFModel;
}
