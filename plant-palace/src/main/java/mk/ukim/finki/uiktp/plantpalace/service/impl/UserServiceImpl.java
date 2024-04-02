package mk.ukim.finki.uiktp.plantpalace.service.impl;

import mk.ukim.finki.uiktp.plantpalace.model.User;
import mk.ukim.finki.uiktp.plantpalace.repository.UserRepository;
import mk.ukim.finki.uiktp.plantpalace.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


}