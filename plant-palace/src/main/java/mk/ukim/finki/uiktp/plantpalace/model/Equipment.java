package mk.ukim.finki.uiktp.plantpalace.model;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Equipment extends Product{

    private EquipmentCategory category;
    public Equipment(EquipmentCategory category){
        this.category=category;
    }
}
