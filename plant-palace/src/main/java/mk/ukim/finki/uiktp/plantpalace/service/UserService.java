package mk.ukim.finki.uiktp.plantpalace.service;

import mk.ukim.finki.uiktp.plantpalace.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findByUsername(String username);
}
