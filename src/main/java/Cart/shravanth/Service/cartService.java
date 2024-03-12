package Cart.shravanth.Service;
import Cart.shravanth.dto.FakeStoreApi;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class cartService {
    RestTemplate Template = new RestTemplate();
    String url = "https://fakestoreapi.com/";
    public FakeStoreApi getCartItem(Long id) {
        FakeStoreApi response = Template.getForObject(url + "cart/" + id, FakeStoreApi.class);
        return response;
    }
    public FakeStoreApi[] getAllCartItems() {
        FakeStoreApi[] response = Template.getForObject(url + "cart", FakeStoreApi[].class);
        return response;
    }
                            
    public FakeStoreApi getCartByUser(Long id) {
        FakeStoreApi response = Template.getForObject(url + "cart/user/" + id, FakeStoreApi.class);
        return response;
    }
    public FakeStoreApi AddCartItem(FakeStoreApi cart){
        FakeStoreApi fetchCart = new FakeStoreApi();
        fetchCart.setId(cart.getId());
        fetchCart.setUserId(cart.getUserId());
        fetchCart.setDate(cart.getDate());
        fetchCart.setProducts(cart.getProducts());
        fetchCart.set__v(cart.get__v());

        FakeStoreApi response = restTemplate.postForObject(url + "cart/", fetchCart, FakeStoreApi.class);
        return response;//Shravanth
    }
    public FakeStoreApi updateCartItem(FakeStoreApi cart) {

        FakeStoreApi fetchCart = new FakeStoreApi();
        fetchCart.setId(cart.getId());
        fetchCart.setUserId(cart.getUserId());
        fetchCart.setDate(cart.getDate());
        fetchCart.setProducts(cart.getProducts());
        fetchCart.set__v(cart.get__v());

        FakeStoreApi response = Template.patchForObject(url + "cart/" + cart.getId(), fetchCart, FakeStoreApi.class);
        return response;

    }
    public void deleteCartItem(Long id){
        restTemplate.delete(url + "cart/" + id);
    }
}
