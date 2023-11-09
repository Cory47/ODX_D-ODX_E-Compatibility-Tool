import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
class Parent_Ref_Model {
    private String IDRef;
    private List<Not_Inherited_Diag_Comm_Model> notInheritedDiagComm;
    private List<Not_Inherited_Dop_Model> notInheritedDopModel;
}
