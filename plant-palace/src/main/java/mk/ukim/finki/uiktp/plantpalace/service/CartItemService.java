package mk.ukim.finki.uiktp.plantpalace.service;

import mk.ukim.finki.uiktp.plantpalace.model.CartItem;

import java.util.List;

public interface CartItemService {


    List<CartItem> getCartItemsByUserId(Long userId);

    CartItem addCartItem(CartItem cartItem);

    void deleteCartItem(Long id);
}
