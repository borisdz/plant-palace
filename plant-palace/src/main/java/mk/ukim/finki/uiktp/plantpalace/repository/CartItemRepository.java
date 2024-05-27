package mk.ukim.finki.uiktp.plantpalace.repository;


import mk.ukim.finki.uiktp.plantpalace.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    List<CartItem> findByUserId(Long userId);

}

