package mk.ukim.finki.uiktp.plantpalace.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Plant extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ime;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Plant_Category plantCategory;

    public Plant(Long id, String name, String description, Double price, Double discount, Double totalPrice, Integer quantity, byte[] filePath, String fileExtension, String slug,
                 Plant plant, String ime, Plant_Category plantCategory) {
        super(id, name, description, price, discount, totalPrice, quantity, filePath, fileExtension, slug, plant);
        this.ime = ime;
        this.plantCategory = plantCategory;
    }

    public Plant(String ime, Plant_Category plantCategory) {
        this.ime = ime;
        this.plantCategory = plantCategory;
    }

    public Plant(String name, String description, Double price, Double discount, Double totalPrice, Integer quantity, byte[] filePath, String fileExtension, String slug, String ime, Plant_Category plantCategory) {
        super(name, description, price, discount, totalPrice, quantity, filePath, fileExtension, slug);
        this.ime = ime;
        this.plantCategory = plantCategory;
    }
}
