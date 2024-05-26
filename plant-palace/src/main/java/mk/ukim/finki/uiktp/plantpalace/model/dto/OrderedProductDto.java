package mk.ukim.finki.uiktp.plantpalace.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mk.ukim.finki.uiktp.plantpalace.model.Product;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderedProductDto {

    private Long productId;
    private Integer quantity;
}
