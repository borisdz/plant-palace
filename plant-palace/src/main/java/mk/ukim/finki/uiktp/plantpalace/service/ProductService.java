package mk.ukim.finki.uiktp.plantpalace.service;

import mk.ukim.finki.uiktp.plantpalace.model.Product;
import mk.ukim.finki.uiktp.plantpalace.model.dto.ProductDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<Product> add(ProductDto productDto);
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Optional<Product> edit(Long id, ProductDto productDto);
    void delete(Long id);

}
