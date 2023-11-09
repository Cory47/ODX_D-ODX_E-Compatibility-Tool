package Models.Diag_Layer_Container.Variant.ECUVariantPatterns;

import Models.Diag_Layer_Container.Variant.ECUVariantPatterns.Matching_Parameters.Matching_Parameter_Model;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ECU_Variant_Pattern_Model {
    private List<Matching_Parameter_Model> matchingParameters;
}