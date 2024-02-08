package ODX_E_Model.ECU_Config;

import ODX_E_Model.ECU_Config.Config_Data.Config_Data_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class ECU_Config_Model {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("SHORT-NAME")
    private String shortName;
    @JsonProperty("LONG-NAME")
    private String longName;
    @JsonProperty("CONFIG-DATAS")
    private List<Config_Data_Model> configData;
}
