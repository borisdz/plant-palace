package mk.ukim.finki.uiktp.plantpalace.web.controller;

import mk.ukim.finki.uiktp.plantpalace.model.OrderedProduct;
import mk.ukim.finki.uiktp.plantpalace.model.dto.OrderedProductDto;
import mk.ukim.finki.uiktp.plantpalace.service.OrderedProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ordered-products")
public class OrderedProductController {

    private final OrderedProductService orderedProductService;

    public OrderedProductController(OrderedProductService orderedProductService) {
        this.orderedProductService = orderedProductService;
    }

    @PostMapping
    public ResponseEntity<OrderedProduct> createOrderedProduct(@RequestBody OrderedProductDto orderedProductDto) {
        OrderedProduct createdOrderedProduct = orderedProductService.create(orderedProductDto.getProductId(), orderedProductDto.getQuantity());
        return new ResponseEntity<>(createdOrderedProduct, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrderedProduct(@PathVariable Long id) {
        orderedProductService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
