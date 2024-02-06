package ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Pre_Condition_State_Refs;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Comms.Diag_Service.Pre_Condition_State_Refs.Pre_Condition_State_Ref.Pre_Condition_State_Ref_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Pre_Condition_State_Refs_Model {
    @JsonProperty("PRE-CONDITION-STATE-REF")
    List<Pre_Condition_State_Ref_Model> preConditionStateRef;
}
