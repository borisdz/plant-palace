package mk.ukim.finki.uiktp.plantpalace.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mk.ukim.finki.uiktp.plantpalace.model.enumerations.Status;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "delivery_address")
    private String delivery_address;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "date_of_order")
    private Timestamp date_of_order;

    @Column(name = "note")
    private String note;

    @Column(name = "phone_number")
    private Long phone_number;

    @ManyToOne
    @JoinColumn(name= "ct_city")
    private City city;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "order_id")
    private List<OrderedProduct> orderedProducts;

}
