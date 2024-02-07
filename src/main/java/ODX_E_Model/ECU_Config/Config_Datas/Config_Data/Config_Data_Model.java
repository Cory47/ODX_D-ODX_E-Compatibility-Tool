package ODX_E_Model.ECU_Config.Config_Datas.Config_Data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Config_Data_Model {
    @JsonProperty("SHORT-NAME")
    public String shortName;
    @JsonProperty("LONG-NAME")
    public String longName;
}
