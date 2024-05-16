package mk.ukim.finki.uiktp.plantpalace.model.dto;

import lombok.Data;

@Data
public class CategoryDto {
    private String name;
    private Long parentId;
}
