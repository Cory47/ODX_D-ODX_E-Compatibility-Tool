package Models.Diag_Layer_Container.Variants.Variant.Requests;

import Models.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.Structures.Params.Param_Model;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Request_Model {
    private String ID;
    private String shortName;
    private String longName;
    private List<Param_Model> parameters;
}
