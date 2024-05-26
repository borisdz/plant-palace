package mk.ukim.finki.uiktp.plantpalace.service;

import mk.ukim.finki.uiktp.plantpalace.model.OrderedProduct;
import mk.ukim.finki.uiktp.plantpalace.model.Product;
import mk.ukim.finki.uiktp.plantpalace.model.dto.OrderedProductDto;

import java.util.List;

public interface OrderedProductService {

    OrderedProduct findById(Long id);

    List<OrderedProduct> listAll();

    OrderedProduct create(Long productId, Integer quantity);

    OrderedProduct delete(Long id);
}
