package mk.ukim.finki.uiktp.plantpalace.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class OrderedProduct {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Product product;

    private Integer quantity;

    public OrderedProduct(){}

    public OrderedProduct(Product product, Integer quantity){
        this.product = product;
        this.quantity = quantity;
    }
}
