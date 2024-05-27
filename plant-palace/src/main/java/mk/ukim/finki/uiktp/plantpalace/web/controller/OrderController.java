package mk.ukim.finki.uiktp.plantpalace.web.controller;

import mk.ukim.finki.uiktp.plantpalace.model.Order;
import mk.ukim.finki.uiktp.plantpalace.model.Product;
import mk.ukim.finki.uiktp.plantpalace.model.dto.OrderDto;
import mk.ukim.finki.uiktp.plantpalace.model.dto.ProductDto;
import mk.ukim.finki.uiktp.plantpalace.repository.OrderRepository;
import mk.ukim.finki.uiktp.plantpalace.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("https://localhost:4200")
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping
    public ResponseEntity<List<Order>> showAllOrders() {
        List<Order> orders = this.orderService.findAll();
        if (!orders.isEmpty()) {
            return ResponseEntity.ok(orders);
        }
        return ResponseEntity.notFound().build();
    }



    @PostMapping("/add")
    public ResponseEntity<Order> save(@RequestBody OrderDto orderDto) {
        return this.orderService.add(orderDto)
                .map(order -> ResponseEntity.ok().body(order))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Order> save(@PathVariable Long id, @RequestBody OrderDto orderDto) {
        return this.orderService.edit(id, orderDto)
                .map(order -> ResponseEntity.ok().body(order))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        this.orderService.delete(id);
        if (this.orderService.findById(id).isEmpty())
            return ResponseEntity.ok().build();
        return ResponseEntity.badRequest().build();
    }
}
