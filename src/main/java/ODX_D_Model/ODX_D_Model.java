package ODX_D_Model;

import ODX_D_Model.Diag_Layer_Container.Diag_Layer_Container_Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ODX_D_Model {
    @JsonProperty("DIAG-LAYER-CONTAINER")
    private Diag_Layer_Container_Model diagLayerContainer;
}
