import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ECU_Variant_Model {
    private String ID;
    private String shortName;
    private String longName;
    private String desc;
    private String diagDataDictionarySpec;
}
