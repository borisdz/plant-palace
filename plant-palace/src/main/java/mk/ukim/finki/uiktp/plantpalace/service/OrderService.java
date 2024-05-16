package mk.ukim.finki.uiktp.plantpalace.service;

import mk.ukim.finki.uiktp.plantpalace.model.Order;
import mk.ukim.finki.uiktp.plantpalace.model.Product;
import mk.ukim.finki.uiktp.plantpalace.model.dto.OrderDto;
import mk.ukim.finki.uiktp.plantpalace.model.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    Optional<Order> add(OrderDto orderDto);
    List<Order> findAll();
    Optional<Order> findById(Long id);
    Optional<Order> edit(Long id, OrderDto orderDto);
    void delete(Long id);
}
