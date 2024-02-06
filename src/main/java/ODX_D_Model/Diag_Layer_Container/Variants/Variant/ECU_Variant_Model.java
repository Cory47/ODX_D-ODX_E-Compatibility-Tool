package ODX_D_Model.Diag_Layer_Container.Variants.Variant;

import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Parent_Ref_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.ECU_Variant_Patterns.ECU_Variant_Pattern.ECU_Variant_Pattern_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Neg_Responses.Neg_Response_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Pos_Responses.Pos_Response_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.Diag_Data_Dictionary_Spec_Model;
import ODX_D_Model.Diag_Layer_Container.Variants.Variant.Requests.Request_Model;
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
    private List<Request_Model> requests;
    @JsonProperty("POS-RESPONSES")
    private List<Pos_Response_Model> posResponses;
    @JsonProperty("NEG-RESPONSES")
    private List<Neg_Response_Model> negResponses;
    @JsonProperty("ECU-VARIANT-PATTERNS")
    private List<ECU_Variant_Pattern_Model> ECUVariantPatterns;
    @JsonProperty("PARENT-REFS")
    private List<Parent_Ref_Model> Parent_Refs;
}
