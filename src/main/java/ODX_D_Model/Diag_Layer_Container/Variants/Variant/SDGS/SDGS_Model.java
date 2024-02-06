package ODX_D_Model.Diag_Layer_Container.Variants.Variant.SDGS;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.SDGS.SDG.SDG_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SDGS_Model {
    @JsonProperty("SDG")
    List<SDG_Model> SDG;
}
