package Models.Diag_Layer_Container.Variant.Requests;

import Models.Diag_Layer_Container.Variant.Diag_Data_Dictionary_Spec.Structures.Params.Param_Model;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Requests_Model {
    private String ID;
    private String shortName;
    private String longName;
    private List<Param_Model> parameters;
}
