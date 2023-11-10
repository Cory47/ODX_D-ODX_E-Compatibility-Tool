package Models.Diag_Layer_Container.Variant.Diag_Comms.Diag_Service;

import Models.Diag_Layer_Container.Variant.Neg_Responses.Neg_Response_Model;
import Models.Diag_Layer_Container.Variant.Pos_Responses.Pos_Response_Model;
import Models.Diag_Layer_Container.Variant.SDGS.SDGS_Model;
import TODO.Funct_Class_Refs_Model;
import Models.Diag_Layer_Container.Variant.Diag_Comms.Diag_Service.Pre_Condition_State_Refs.Pre_Condition_State_Refs_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Diag_Service_Model {
    private String ID;
    private String shortName;
    private String longName;
    private List<SDGS_Model> SDGS;
    private List<Funct_Class_Refs_Model> functClassRefs;
    private List<Pre_Condition_State_Refs_Model> preConditionStateRefs;
    private List<Pos_Response_Model> posResponse;
    private List<Neg_Response_Model> negResponse;
}
