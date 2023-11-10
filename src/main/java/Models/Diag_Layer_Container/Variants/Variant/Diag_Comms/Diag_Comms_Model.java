package Models.Diag_Layer_Container.Variants.Variant.Diag_Comms;

import Models.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Diag_Service_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Diag_Comms_Model {
    private List<Diag_Service_Model> diagService;
}
