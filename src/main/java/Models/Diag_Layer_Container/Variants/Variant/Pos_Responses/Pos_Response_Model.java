package Models.Diag_Layer_Container.Variants.Variant.Pos_Responses;

import Models.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.Structures.Params.Param_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Pos_Response_Model {
    @JsonProperty("ID")
    private String ID;
    @JsonProperty("SHORT-NAME")
    private String shortName;
    @JsonProperty("LONG-NAME")
    private String longName;
    @JsonProperty("PARAMS")
    private List<Param_Model> parameters;
}
