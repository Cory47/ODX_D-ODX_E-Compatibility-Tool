package ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Neg_Responses.Neg_Response_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Pos_Responses.Pos_Response_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.SDGS.SDGS_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Funct_Class_Refs.Funct_Class_Refs_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Pre_Condition_State_Refs.Pre_Condition_State_Refs_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Diag_Service_Model {
    @JsonProperty("ID")
    private String ID;
    @JsonProperty("SHORT-NAME")
    private String shortName;
    @JsonProperty("LONG-NAME")
    private String longName;
    @JsonProperty("SDGS")
    private List<SDGS_Model> SDGS;
    @JsonProperty("FUNCT-CLASS-REFS")
    private List<Funct_Class_Refs_Model> functClassRefs;
    @JsonProperty("PRE-CONDITION-STATE-REFS")
    private List<Pre_Condition_State_Refs_Model> preConditionStateRefs;
    @JsonProperty("POS-RESPONSE")
    private List<Pos_Response_Model> posResponse;
    @JsonProperty("NEG-RESPONSE")
    private List<Neg_Response_Model> negResponse;
}
