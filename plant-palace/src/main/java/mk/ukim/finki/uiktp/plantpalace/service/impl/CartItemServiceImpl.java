package mk.ukim.finki.uiktp.plantpalace.service.impl;


import mk.ukim.finki.uiktp.plantpalace.model.CartItem;
import mk.ukim.finki.uiktp.plantpalace.repository.CartItemRepository;
import mk.ukim.finki.uiktp.plantpalace.service.CartItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemServiceImpl implements CartItemService {

    private CartItemRepository cartItemRepository;

    public CartItemServiceImpl(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    public List<CartItem> getCartItemsByUserId(Long userId) {
        return cartItemRepository.findByUserId(userId);
    }

    public CartItem addCartItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    public void deleteCartItem(Long id) {
        cartItemRepository.deleteById(id);
    }
}
