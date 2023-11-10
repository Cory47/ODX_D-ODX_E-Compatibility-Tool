package Models.Diag_Layer_Container.Variants.Variant.SDGS.SDG.SDG_Caption;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SDG_Caption_Model {
    @JsonProperty("ID")
    private String ID;
    @JsonProperty("SHORT-NAME")
    private String shortName;
    @JsonProperty("LONG-NAME")
    private String longName;
}
