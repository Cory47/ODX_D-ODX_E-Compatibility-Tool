package Models.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.Structures;

import Models.Diag_Layer_Container.Variants.Variant.Diag_Data_Dictionary_Spec.Structures.Params.Param_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Structure_Model {
    private String shortName;
    private String longName;
    private String description;
    //TODO: Make this an int
    private String byteSize;
    List <Param_Model> params;
}
