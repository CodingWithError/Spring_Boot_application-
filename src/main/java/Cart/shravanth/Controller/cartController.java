package Cart.shravanth.Controller;

import Cart.shravanth.Service.cartService;
import org.springframework.web.bind.annotation.*;

public class cartController {
    cartService CartService;
    public CartContoller(CartService CartService) {
        this.CartService = CartService;
    }
    @GetMapping("/carts/{id}/")
    public FakeStoreApi getCartItem(@PathVariable Long id){
        return CartService.getCartItem(id);
    }
    @GetMapping("/carts/")
    public FakeStoreApi[] getAllCartItems(){
        return CartService.getAllCartItems();
    }
    @GetMapping("/carts/user/{id}/")
    public FakeStoreApi getCartByUser(@PathVariable Long id){
        return CartService.getCartItem(id);
    }
    @PutMapping("/carts/update/{id}/")
    public FakeStoreApi updateCartItem(@RequestBody FakeStoreApi cart){
        return CartService.updateCartItem(cart);
    }
    @DeleteMapping("/carts/delete/{id}/")
    public String deleteCartItem(@PathVariable Long id){
        CartService.deleteCartItem(id);
        return "Your Product has been deleted from the cart";
    }


    @GetMapping("/carts/Add/")
    public FakeStoreApi AddCartItem(@RequestBody FakeStoreApi cart){
        return CartService.AddCartItem(cart);
    }
}

