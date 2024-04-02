package mk.ukim.finki.uiktp.plantpalace.service.impl;

import mk.ukim.finki.uiktp.plantpalace.model.User;
import mk.ukim.finki.uiktp.plantpalace.model.enumerations.Role;
import mk.ukim.finki.uiktp.plantpalace.model.exceptions.InvalidUsernameOrPasswordException;
import mk.ukim.finki.uiktp.plantpalace.model.exceptions.UsernameAlreadyExistsException;
import mk.ukim.finki.uiktp.plantpalace.repository.UserRepository;
import mk.ukim.finki.uiktp.plantpalace.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Boolean checkPassword(User user,String password) {
        if(user == null){
            return false;
        }
        return user.getPassword().equals(password);
    }

    @Override
    public User register(String username, String password, String name, Role userRole) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty())
            throw new InvalidUsernameOrPasswordException();
        if (this.userRepository.findByUsername(username).isPresent())
            throw new UsernameAlreadyExistsException(username);
        User user = new User(password, username, userRole);
        return userRepository.save(user);
    }

}
