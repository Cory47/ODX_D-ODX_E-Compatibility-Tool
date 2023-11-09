import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Diag_Data_Dictionary_Model {
    private String ID;
    private String shortName;
    private String longName;
    private String compuMethod;
    private String category;
    private String compuInternalToPhys;
    private String compuScale;
    private String lowerLimit;
    private String upperLimit;
    private String compuConst;
    private String VT;
    private String diagCodedTypeBaseDataType;
    private String bitLength;
    private String physicalTypeBaseDataType;
    private String internalConstr;
    private String scaleConstrValidity;
    private String lowerLimitSCV;
    private String upperLimitSCV;
}
