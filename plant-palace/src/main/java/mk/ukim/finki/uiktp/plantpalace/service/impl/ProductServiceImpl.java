package mk.ukim.finki.uiktp.plantpalace.service.impl;

import mk.ukim.finki.uiktp.plantpalace.model.Product;
import mk.ukim.finki.uiktp.plantpalace.model.dto.ProductDto;
import mk.ukim.finki.uiktp.plantpalace.repository.ProductRepository;
import mk.ukim.finki.uiktp.plantpalace.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Optional<Product> add(ProductDto productDto)  {
      Product product = new Product();

      product.setName(productDto.getName());
      product.setDescription(productDto.getDescription());
      product.setPrice(productDto.getPrice());
      product.setFilePath(productDto.getFilePath());
      product.setFileExtension(productDto.getFileExtension());
      product.setDiscount(productDto.getDiscount());
      product.setTotalPrice(productDto.getTotalPrice());
      product.setQuantity(productDto.getQuantity());
      product.setSlug(productDto.getSlug());

      return Optional.of(this.productRepository.save(product));
    }

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return this.productRepository.findById(id);
    }

    @Override
    public Optional<Product> edit(Long id, ProductDto productDto) {
        Product product = this.productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product not found with id: " + id));

        product.setFilePath(productDto.getFilePath());
        product.setFileExtension(productDto.getFileExtension());
        product.setName(productDto.getName());
        product.setDescription(product.getDescription());
        product.setDiscount(productDto.getDiscount());
        product.setPrice(product.getPrice());
        product.setQuantity(product.getQuantity());
        product.setTotalPrice(product.getTotalPrice());
        product.setSlug(product.getSlug());

        return Optional.of(this.productRepository.save(product));
    }

    @Override
    public void delete(Long id) {
        this.productRepository.deleteById(id);
    }
}
