package ODX_E_Model.ECU_Config.Config_Data;

import ODX_E_Model.ECU_Config.Config_Data.Config_Record.Config_Record_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class Config_Data_Model {
    @JsonProperty("SHORT-NAME")
    public String shortName;
    @JsonProperty("LONG-NAME")
    public String longName;
    @JsonProperty("CONFIG-RECORDS")
    public List<Config_Record_Model> configRecords;
}
