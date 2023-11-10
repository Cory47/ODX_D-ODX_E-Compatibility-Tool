package Models.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Audience.Enabled_Audience_Refs;

import Models.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Audience.Enabled_Audience_Refs.Enabled_Audience_Ref.Enabled_Audience_Ref_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder

public class Enabled_Audience_Refs_Model {
    private List<Enabled_Audience_Ref_Model> enabledAudienceRef;
}
