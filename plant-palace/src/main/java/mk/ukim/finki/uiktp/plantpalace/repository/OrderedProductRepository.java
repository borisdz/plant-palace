package mk.ukim.finki.uiktp.plantpalace.repository;

import mk.ukim.finki.uiktp.plantpalace.model.OrderedProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderedProductRepository extends JpaRepository<OrderedProduct, Long> {

}
