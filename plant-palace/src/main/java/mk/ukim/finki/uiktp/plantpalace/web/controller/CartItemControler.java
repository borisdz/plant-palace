package mk.ukim.finki.uiktp.plantpalace.web.controller;


import mk.ukim.finki.uiktp.plantpalace.model.CartItem;
import mk.ukim.finki.uiktp.plantpalace.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart-items")
public class CartItemControler {


    @Autowired
    private CartItemService cartItemService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<CartItem>> getCartItemsByUserId(@PathVariable Long userId) {
        List<CartItem> cartItems = cartItemService.getCartItemsByUserId(userId);
        return new ResponseEntity<>(cartItems, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CartItem> addCartItem(@RequestBody CartItem cartItem) {
        CartItem newCartItem = cartItemService.addCartItem(cartItem);
        return new ResponseEntity<>(newCartItem, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCartItem(@PathVariable Long id) {
        cartItemService.deleteCartItem(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
