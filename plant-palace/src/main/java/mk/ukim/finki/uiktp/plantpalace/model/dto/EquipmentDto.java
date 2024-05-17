package mk.ukim.finki.uiktp.plantpalace.model.dto;

import lombok.Data;
import mk.ukim.finki.uiktp.plantpalace.model.EquipmentCategory;

@Data
public class EquipmentDto {
    private EquipmentCategory category;
    private String name;
    private String description;
    private Double price;
    private Double discount;
    private Double totalPrice;
    private Integer quantity;
    private byte[] filePath;
    private String fileExtension;
    private String slug;

    public EquipmentDto(EquipmentCategory category, String name, String description, Double price, Double discount, Double totalPrice,
                        Integer quantity, byte[] filePath, String fileExtension, String slug) {
        this.category = category;
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
}
