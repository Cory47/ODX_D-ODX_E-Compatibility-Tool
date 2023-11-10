package Models.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Funct_Class_Refs;

import Models.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Funct_Class_Refs.Funct_Class_Ref.Funct_Class_Ref_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Funct_Class_Refs_Model {
    private List<Funct_Class_Ref_Model> functClassRef;
}
