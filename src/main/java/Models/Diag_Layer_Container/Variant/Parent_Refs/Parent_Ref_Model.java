package Models.Diag_Layer_Container.Variant.Parent_Refs;

import Models.Diag_Layer_Container.Variant.Parent_Refs.Not_Inhereted_Diag_Comm.Not_Inherited_Diag_Comm_Model;
import TODO.Not_Inherited_Dop_Model;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Parent_Ref_Model {
    private String IDRef;
    private String type;
    private List<Not_Inherited_Diag_Comm_Model> notInheritedDiagComm;
    private List<Not_Inherited_Dop_Model> notInheritedDopModel;
}
