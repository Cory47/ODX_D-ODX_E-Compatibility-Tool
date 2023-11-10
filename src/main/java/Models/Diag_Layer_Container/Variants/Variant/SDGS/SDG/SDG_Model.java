package Models.Diag_Layer_Container.Variants.Variant.SDGS.SDG;

import Models.Diag_Layer_Container.Variants.Variant.SDGS.SDG.SD.SD_Model;
import Models.Diag_Layer_Container.Variants.Variant.SDGS.SDG.SDG_Caption.SDG_Caption_Model;
import lombok.Builder;
import lombok.Data;
import java.util.List;
@Data
@Builder

public class SDG_Model {
    private List<SD_Model> SDModel;
    private List<SDG_Caption_Model> SDGCaption;
}
