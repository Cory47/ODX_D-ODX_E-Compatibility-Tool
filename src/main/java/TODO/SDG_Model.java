package TODO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SDG_Model {
    private String ID;
    private String shortName;
    private String longName;
    private String SDSI;
}
