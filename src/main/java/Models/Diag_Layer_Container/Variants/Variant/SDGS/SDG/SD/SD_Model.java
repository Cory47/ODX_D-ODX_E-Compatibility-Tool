package Models.Diag_Layer_Container.Variants.Variant.SDGS.SDG.SD;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SD_Model {
    @JsonProperty("SI")
    private String SI;
}
