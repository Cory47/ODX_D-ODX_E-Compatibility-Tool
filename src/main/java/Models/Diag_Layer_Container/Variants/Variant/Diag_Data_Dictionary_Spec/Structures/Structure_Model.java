package Models.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.Structures;

import Models.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.Structures.Params.Param_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Structure_Model {
    @JsonProperty("SHORT-NAME")
    private String shortName;
    @JsonProperty("LONG-NAME")
    private String longName;
    @JsonProperty("DESCRIPTION")
    private String description;
    //TODO: Make this an int
    @JsonProperty("BYTE-SIZE")
    private String byteSize;
    @JsonProperty("PARAMS")
    List <Param_Model> params;
}
