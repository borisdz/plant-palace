package mk.ukim.finki.uiktp.plantpalace.web.controller;

import mk.ukim.finki.uiktp.plantpalace.model.User;
import mk.ukim.finki.uiktp.plantpalace.model.dto.LoginDto;
import mk.ukim.finki.uiktp.plantpalace.model.dto.RegisterDto;
import mk.ukim.finki.uiktp.plantpalace.service.AuthService;
import mk.ukim.finki.uiktp.plantpalace.service.UserService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("https://localhost:4200")
@RequestMapping("/authentication")
public class AuthController {
    private final AuthService authService;
    private final UserService userService;
    public AuthController(AuthService authService, UserService userService) {
        this.authService = authService;
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginDto loginDto){
        Optional<User> user = this.userService.findByUsername(loginDto.getUsername());
        if(user.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        if(!this.authService.checkPassword(user.get(), loginDto.getPassword())){
            return ResponseEntity.status(HttpStatusCode.valueOf(401)).build();
        }

        return ResponseEntity.ok().build();
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterDto registerDto){
        if(this.userService.findByUsername(registerDto.getUsername()).isPresent()){
            return ResponseEntity.status(HttpStatusCode.valueOf(409)).build();
        }
        this.authService.register(registerDto.getUsername(),registerDto.getPassword(),registerDto.getName(),registerDto.getRole());
        return ResponseEntity.ok().build();
    }


}
