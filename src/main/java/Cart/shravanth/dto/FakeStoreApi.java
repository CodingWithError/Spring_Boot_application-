package Cart.shravanth.dto;

import Cart.shravanth.Model.product;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Date;

@Getter
@Setter
public enum FakeStoreApi {
    String id;
    String UserId;
    Date date;
    List<product> products;


}
