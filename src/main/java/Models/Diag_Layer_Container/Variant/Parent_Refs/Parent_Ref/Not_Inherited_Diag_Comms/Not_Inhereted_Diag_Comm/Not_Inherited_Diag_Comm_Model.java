package Models.Diag_Layer_Container.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Diag_Comms.Not_Inhereted_Diag_Comm;

import Models.Diag_Layer_Container.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Diag_Comms.Not_Inhereted_Diag_Comm.Diag_Comm_SNREF.Diag_Comm_SNREF_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Not_Inherited_Diag_Comm_Model {
    private List<Diag_Comm_SNREF_Model> diagCommSNREF;
}
