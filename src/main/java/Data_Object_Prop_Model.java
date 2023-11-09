import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Data_Object_Prop_Model {
    private String ID;
    private String shortName;
    private String longName;

    private String Desc;
    private String Category;

}
