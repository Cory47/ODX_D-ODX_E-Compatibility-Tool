package ODX_E_Model.ECU_Config.Config_Datas;

import ODX_E_Model.ECU_Config.Config_Datas.Config_Data.Config_Data_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@Data
public class Config_Datas_Model {
    @JsonProperty("CONFIG-DATA")
    private List<Config_Data_Model> configData;
}
