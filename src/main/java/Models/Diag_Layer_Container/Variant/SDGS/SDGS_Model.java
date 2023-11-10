package Models.Diag_Layer_Container.Variant.SDGS;
import Models.Diag_Layer_Container.Variant.SDGS.SDG.SDG_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SDGS_Model {
    List<SDG_Model> SDG;
}
