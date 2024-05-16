package mk.ukim.finki.uiktp.plantpalace.service.impl;

import mk.ukim.finki.uiktp.plantpalace.model.Order;
import mk.ukim.finki.uiktp.plantpalace.model.Product;
import mk.ukim.finki.uiktp.plantpalace.model.dto.OrderDto;
import mk.ukim.finki.uiktp.plantpalace.repository.CityRepository;
import mk.ukim.finki.uiktp.plantpalace.repository.OrderRepository;
import mk.ukim.finki.uiktp.plantpalace.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final CityRepository cityRepository;

    public OrderServiceImpl(OrderRepository orderRepository, CityRepository cityRepository) {
        this.orderRepository = orderRepository;
        this.cityRepository = cityRepository;
    }

    @Override
    public Optional<Order> add(OrderDto orderDto) {
        Order order = new Order();
        order.setDate_of_order(orderDto.getDate_of_order());
        order.setStatus(orderDto.getStatus());
        order.setDelivery_address(orderDto.getDelivery_address());
        order.setNote(orderDto.getNote());
        order.setPhone_number(orderDto.getPhone_number());
        order.setCity(orderDto.getCity());

        return Optional.of(this.orderRepository.save(order));
    }

    @Override
    public List<Order> findAll() {
        return this.orderRepository.findAll();
    }

    @Override
    public Optional<Order> findById(Long id) {
        return this.orderRepository.findById(id);
    }

    @Override
    public Optional<Order> edit(Long id, OrderDto orderDto) {
        Order order = this.orderRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Order not found with id: " + id));
        order.setDate_of_order(orderDto.getDate_of_order());
        order.setStatus(orderDto.getStatus());
        order.setDelivery_address(orderDto.getDelivery_address());
        order.setNote(orderDto.getNote());
        order.setPhone_number(orderDto.getPhone_number());
        order.setCity(orderDto.getCity());
        return Optional.of(this.orderRepository.save(order));
    }

    @Override
    public void delete(Long id) {
        this.orderRepository.deleteById(id);
    }
}
