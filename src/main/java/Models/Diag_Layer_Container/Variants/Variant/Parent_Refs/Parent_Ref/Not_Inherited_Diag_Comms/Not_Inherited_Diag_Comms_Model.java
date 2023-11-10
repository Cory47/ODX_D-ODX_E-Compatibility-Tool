package Models.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Diag_Comms;

import Models.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Not_Inherited_Diag_Comms.Not_Inhereted_Diag_Comm.Not_Inherited_Diag_Comm_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Not_Inherited_Diag_Comms_Model {
    @JsonProperty("NOT-INHERITED-DIAG-COMM")
    private List<Not_Inherited_Diag_Comm_Model> notInheritedDiagComm;
}
