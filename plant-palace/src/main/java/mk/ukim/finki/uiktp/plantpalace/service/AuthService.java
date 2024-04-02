package mk.ukim.finki.uiktp.plantpalace.service;

import mk.ukim.finki.uiktp.plantpalace.model.User;
import mk.ukim.finki.uiktp.plantpalace.model.enumerations.Role;

public interface AuthService {
    User login(String username, String password);
    Boolean checkPassword(User user, String password);
    User register(String username, String password, String name, Role userRole);
}
