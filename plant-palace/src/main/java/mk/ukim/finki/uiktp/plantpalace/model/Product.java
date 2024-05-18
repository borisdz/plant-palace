package mk.ukim.finki.uiktp.plantpalace.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Double discount;
    private Double totalPrice;
    private Integer quantity;
    @Lob
    private byte[] filePath;
    private String fileExtension;
    private String slug;

    @ManyToOne
    private Plant plant;
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public Product(String name, String description, Double price, Double discount,
                   Double totalPrice, Integer quantity, byte[] filePath, String fileExtension, String slug) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.discount = discount;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.filePath = filePath;
        this.fileExtension = fileExtension;
        this.slug = slug;
    }

    public Product(String name, String description, Double price, Double discount, Double totalPrice, Integer quantity, byte[] filePath, String fileExtension, String slug, Plant plant) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.discount = discount;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.filePath = filePath;
        this.fileExtension = fileExtension;
        this.slug = slug;
        this.plant = plant;
    }
}
