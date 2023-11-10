package Models.Diag_Layer_Container.Variants.Variant.Parent_Refs;

import Models.Diag_Layer_Container.Variants.Variant.Parent_Refs.Parent_Ref.Parent_Ref_Model;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Parent_Refs_Model {
    private List<Parent_Ref_Model> parentRefModel;
}
