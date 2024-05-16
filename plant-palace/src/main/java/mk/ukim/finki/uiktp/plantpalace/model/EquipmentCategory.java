package mk.ukim.finki.uiktp.plantpalace.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class EquipmentCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Category name")
    private String categoryName;

    @OneToMany
    private List<Equipment> equipmentList;

}
