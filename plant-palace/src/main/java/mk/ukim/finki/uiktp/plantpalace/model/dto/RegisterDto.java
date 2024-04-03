package mk.ukim.finki.uiktp.plantpalace.model.dto;

import lombok.Data;
import mk.ukim.finki.uiktp.plantpalace.model.enumerations.Role;

@Data
public class RegisterDto {
    private String username;
    private String password;
    private String name;
    private Role role;
}
