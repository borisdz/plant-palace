package mk.ukim.finki.uiktp.plantpalace.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mk.ukim.finki.uiktp.plantpalace.model.City;
import mk.ukim.finki.uiktp.plantpalace.model.enumerations.Status;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private String delivery_address;

    private Status status;

    private Timestamp date_of_order;

    private String note;

    private Long phone_number;

    private City city;
}
