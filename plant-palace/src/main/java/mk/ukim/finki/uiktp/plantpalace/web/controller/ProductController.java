package mk.ukim.finki.uiktp.plantpalace.web.controller;

import mk.ukim.finki.uiktp.plantpalace.model.Product;
import mk.ukim.finki.uiktp.plantpalace.model.dto.ProductDto;
import mk.ukim.finki.uiktp.plantpalace.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("https://localhost:4200")
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> showAllProducts() {
        List<Product> products = this.productService.findAll();
        if (!products.isEmpty()) {
            return ResponseEntity.ok(products);
        }
        return ResponseEntity.notFound().build();
    }



    @PostMapping("/add")
    public ResponseEntity<Product> save(@RequestBody ProductDto productDto) {
        return this.productService.add(productDto)
                .map(product -> ResponseEntity.ok().body(product))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Product> save(@PathVariable Long id, @RequestBody ProductDto productDto) {
        return this.productService.edit(id, productDto)
                .map(product -> ResponseEntity.ok().body(product))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        this.productService.delete(id);
        if (this.productService.findById(id).isEmpty())
            return ResponseEntity.ok().build();
        return ResponseEntity.badRequest().build();
    }


}
