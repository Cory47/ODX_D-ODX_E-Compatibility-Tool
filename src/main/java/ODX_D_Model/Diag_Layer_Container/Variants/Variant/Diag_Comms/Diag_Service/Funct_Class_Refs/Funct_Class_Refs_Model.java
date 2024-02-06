package ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Funct_Class_Refs;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Funct_Class_Refs.Funct_Class_Ref.Funct_Class_Ref_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Funct_Class_Refs_Model {
    @JsonProperty("FUNCT-CLASS-REF")
    private List<Funct_Class_Ref_Model> functClassRef;
}
