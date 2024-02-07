package ODX_E_Model;

import ODX_E_Model.ECU_Config.ECU_Config_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ODX_E_Model {
    @JsonProperty("ECU-CONFIG")
    private ECU_Config_Model ecu_config_model;
}
