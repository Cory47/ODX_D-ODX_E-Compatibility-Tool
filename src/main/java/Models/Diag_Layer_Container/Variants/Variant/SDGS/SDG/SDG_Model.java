package Models.Diag_Layer_Container.Variants.Variant.SDGS.SDG;

import Models.Diag_Layer_Container.Variants.Variant.SDGS.SDG.SD.SD_Model;
import Models.Diag_Layer_Container.Variants.Variant.SDGS.SDG.SDG_Caption.SDG_Caption_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor

public class SDG_Model {
    @JsonProperty("SD")
    private List<SD_Model> SDModel;
    @JsonProperty("SD-CAPTION")
    private List<SDG_Caption_Model> SDGCaption;
}
