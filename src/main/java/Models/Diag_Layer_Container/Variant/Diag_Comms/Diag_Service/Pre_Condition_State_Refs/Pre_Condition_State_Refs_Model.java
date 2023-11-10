package Models.Diag_Layer_Container.Variant.Diag_Comms.Diag_Service.Pre_Condition_State_Refs;

import Models.Diag_Layer_Container.Variant.Diag_Comms.Diag_Service.Pre_Condition_State_Refs.Pre_Condition_State_Ref.Pre_Condition_State_Ref_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Pre_Condition_State_Refs_Model {
    List<Pre_Condition_State_Ref_Model> preConditionStateRef;
}
