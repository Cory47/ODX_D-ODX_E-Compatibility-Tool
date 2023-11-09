import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Diag_Service_Model {
    private String ID;
    private String shortName;
    private String longName;
    private String desc;
    private String SDSI;
    private String IDFCR;
    private String functClassRef;
    private String functClassIDRef;
    private String audienceISDevelopment;
    private String enabledAudienceRefIDRef;
    private String preConditionRefIDRef;
    private String posResponse;
    private String negResponse;
}
