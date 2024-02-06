package ODX_D_Model.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Diag_Comms.Not_Inhereted_Diag_Comm.Not_Inherited_Diag_Comm_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Dops.Not_Inherited_Dop.Not_Inherited_Dop_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Parent_Ref_Model {
    @JsonProperty("ID-REF")
    private String IDRef;
    @JsonProperty("TYPE")
    private String type;
    @JsonProperty("NOT-INHERITED-DIAG-COMM")
    private List<Not_Inherited_Diag_Comm_Model> notInheritedDiagComm;
    @JsonProperty("NOT-INHERITED-DOP")
    private List<Not_Inherited_Dop_Model> notInheritedDopModel;
}
