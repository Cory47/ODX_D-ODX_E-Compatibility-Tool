package Models.Diag_Layer_Container.Variant.Diag_Comms.Diag_Service.Audience;

import Models.Diag_Layer_Container.Variant.Diag_Comms.Diag_Service.Audience.Enabled_Audience_Refs.Enabled_Audience_Refs_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Audience_Model {
    private List<Enabled_Audience_Refs_Model> enabledAudienceRefs;
    private String isDevelopment;
    private String isAfterSales;
    private String isAfterMarket;
}
