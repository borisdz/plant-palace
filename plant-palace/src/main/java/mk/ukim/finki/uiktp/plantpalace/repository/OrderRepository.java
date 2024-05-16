package mk.ukim.finki.uiktp.plantpalace.repository;

import mk.ukim.finki.uiktp.plantpalace.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
