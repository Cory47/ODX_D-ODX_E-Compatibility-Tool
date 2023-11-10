package Models.Diag_Layer_Container.Variant;

import Models.Diag_Layer_Container.Variant.Parent_Refs.Parent_Ref.Parent_Ref_Model;
import Models.Diag_Layer_Container.Variant.ECU_Variant_Patterns.ECU_Variant_Pattern_Model;
import Models.Diag_Layer_Container.Variant.Neg_Responses.Neg_Response_Model;
import Models.Diag_Layer_Container.Variant.Pos_Responses.Pos_Response_Model;
import Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.Diag_Data_Dictionary_Spec_Model;
import Models.Diag_Layer_Container.Variant.Requests.Request_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ECU_Variant_Model {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("SHORT-NAME")
    private String shortName;
    @JsonProperty("LONG-NAME")
    private String longName;
    @JsonProperty("DIAG-DATA-DICTIONARY-SPEC")
    private Diag_Data_Dictionary_Spec_Model diagDataDictionarySpec;
    @JsonProperty("REQUESTS")
    private Request_Model requests;
    @JsonProperty("POS-RESPONSE")
    private List<Pos_Response_Model> posResponses;
    @JsonProperty("NEG-RESPONSE")
    private List<Neg_Response_Model> negResponses;
    @JsonProperty("ECU-VARIANT_PATTERN")
    private List<ECU_Variant_Pattern_Model> ECUVariantPatterns;
    @JsonProperty("PARENT-REFS")
    private List<Parent_Ref_Model> Parent_Refs;
}
