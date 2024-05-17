package mk.ukim.finki.uiktp.plantpalace.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Plant_Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Plant_Category(String name) {
        this.name = name;

    }

    @OneToMany(mappedBy = "plantCategory")
    private List<Plant> plants;

    public Plant_Category(String name, List<Plant> plants) {
        this.name = name;
        this.plants = plants;
    }
}
