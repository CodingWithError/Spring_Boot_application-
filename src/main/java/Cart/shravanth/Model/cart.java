package Cart.shravanth.Model;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Getter
@Setter
public class cart {
    private double id;
    private double userId;
    private String date;
    private List<product> products;

}
