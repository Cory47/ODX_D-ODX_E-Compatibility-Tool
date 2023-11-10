package Models.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Diag_Comms;

import Models.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Diag_Comms.Not_Inhereted_Diag_Comm.Not_Inherited_Diag_Comm_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Not_Inherited_Diag_Comms_Model {
    private List<Not_Inherited_Diag_Comm_Model> notInheritedDiagComm;
}
