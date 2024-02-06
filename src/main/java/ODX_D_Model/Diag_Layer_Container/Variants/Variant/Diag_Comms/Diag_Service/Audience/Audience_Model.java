package ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Audience;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Audience.Enabled_Audience_Refs.Enabled_Audience_Refs_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Audience_Model {
    @JsonProperty("ENABLED-AUDIENCE-REFS")
    private List<Enabled_Audience_Refs_Model> enabledAudienceRefs;
    @JsonProperty("IS-DEVELOPMENT")
    private String isDevelopment;
    @JsonProperty("IS-AFTER-SALES")
    private String isAfterSales;
    @JsonProperty("ISAFTERMARKET")
    private String isAfterMarket;
}
