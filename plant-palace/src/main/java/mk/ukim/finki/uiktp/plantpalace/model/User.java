package mk.ukim.finki.uiktp.plantpalace.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mk.ukim.finki.uiktp.plantpalace.model.enumerations.Role;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "password")
    private String password;

    @Column(name = "user_name")
    private String username;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    public User(String password, String username, Role role){
        this.password=password;
        this.username=username;
        this.role=role;
    }

}