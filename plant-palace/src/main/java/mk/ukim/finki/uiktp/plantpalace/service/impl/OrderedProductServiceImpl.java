package mk.ukim.finki.uiktp.plantpalace.service.impl;

import mk.ukim.finki.uiktp.plantpalace.model.OrderedProduct;
import mk.ukim.finki.uiktp.plantpalace.model.Product;
import mk.ukim.finki.uiktp.plantpalace.model.exceptions.InvalidOrderedProductIdException;
import mk.ukim.finki.uiktp.plantpalace.repository.OrderedProductRepository;
import mk.ukim.finki.uiktp.plantpalace.repository.ProductRepository;
import mk.ukim.finki.uiktp.plantpalace.service.OrderedProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderedProductServiceImpl implements OrderedProductService {

    private final OrderedProductRepository orderedProductRepository;
    private final ProductRepository productRepository;

    public OrderedProductServiceImpl(OrderedProductRepository orderedProductRepository, ProductRepository productRepository) {
        this.orderedProductRepository = orderedProductRepository;
        this.productRepository = productRepository;
    }

    @Override
    public OrderedProduct findById(Long id) {
        return orderedProductRepository.findById(id).orElseThrow(InvalidOrderedProductIdException::new);
    }

    @Override
    public List<OrderedProduct> listAll() {
        return orderedProductRepository.findAll();
    }

    @Override
    public OrderedProduct create(Long productId, Integer quantity) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new IllegalArgumentException("Product not found with id: " + productId));
        return orderedProductRepository.save(new OrderedProduct(product, quantity));
    }

    @Override
    public OrderedProduct delete(Long id) {
        OrderedProduct orderedProduct = orderedProductRepository.findById(id).orElseThrow(InvalidOrderedProductIdException::new);
        orderedProductRepository.delete(orderedProduct);
        return orderedProduct;
    }
}
