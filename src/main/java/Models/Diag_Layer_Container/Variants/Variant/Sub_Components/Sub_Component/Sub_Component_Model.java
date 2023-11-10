package Models.Diag_Layer_Container.Variants.Variant.Sub_Components.Sub_Component;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Sub_Component_Model {
    @JsonProperty("ID")
    private String ID;
    @JsonProperty("SHORT-NAME")
    private String shortName;
    @JsonProperty("LONG-NAME")
    private String longName;
}
