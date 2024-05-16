package mk.ukim.finki.uiktp.plantpalace.model.dto;

import lombok.Data;
import mk.ukim.finki.uiktp.plantpalace.model.EquipmentCategory;

@Data
public class EquipmentDto {
    private EquipmentCategory category;

    public EquipmentDto(EquipmentCategory category){
        this.category=category;
    }
}
