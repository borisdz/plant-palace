package mk.ukim.finki.uiktp.plantpalace.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Plant extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ime;

    public Plant(Long id, String name, String description, Double price, Double discount, Double totalPrice, Integer quantity, byte[] filePath, String fileExtension, String slug,
                 Plant plant, String ime) {
        super(id, name, description, price, discount, totalPrice, quantity, filePath, fileExtension, slug, plant);
        this.ime = ime;
    }

    public Plant(String ime) {
        this.ime = ime;
    }

    public Plant(String name, String description, Double price, Double discount, Double totalPrice, Integer quantity, byte[] filePath, String fileExtension, String slug, String ime) {
        super(name, description, price, discount, totalPrice, quantity, filePath, fileExtension, slug);
        this.ime = ime;
    }
}
