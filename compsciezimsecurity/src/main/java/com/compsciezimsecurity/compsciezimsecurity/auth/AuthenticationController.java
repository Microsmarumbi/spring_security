package com.compsciezimsecurity.compsciezimsecurity.auth;
import com.compsciezimsecurity.compsciezimsecurity.config.JwtService;
import com.compsciezimsecurity.compsciezimsecurity.model.User;
import com.compsciezimsecurity.compsciezimsecurity.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuthenticationController {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private  final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    @PostMapping("/register")
    public ResponseEntity<Map<String,Object>> register(@RequestBody User request){
        request.setPassword(passwordEncoder.encode(request.getPassword()));
        userRepository.save(request);
        return ResponseEntity.ok().body(Map.of("response","User added Successfully"));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<Map<String,Object>> authenticate(@RequestBody AuthRequest request1){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                request1.getUsername(),
                request1.getPassword()
        ));
        var user = userRepository.findByEmail(request1.getUsername()).orElseThrow(
                ()-> new UsernameNotFoundException("User not found")
        );
        String token = jwtService.generateToken(user);

        return ResponseEntity.ok().body(Map.of("response","Successfully authenticated", "token",token));

    }

}




