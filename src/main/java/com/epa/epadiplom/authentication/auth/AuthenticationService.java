package com.epa.epadiplom.authentication.auth;

import com.epa.epadiplom.authentication.domainService.JwtService;
import com.epa.epadiplom.models.entities.User;
import com.epa.epadiplom.models.entities.employeeAttributes.Role;
import com.epa.epadiplom.models.repositories.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public com.epa.epadiplom.authentication.auth.AuthenticationResponse register(RegisterRequest request) {
        var user = User.builder()
                .firstName(request.getFirstName())
                .mail(request.getMail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();
        userRepo.save(user);
        var jwtToken = jwtService.generateToken(user);
        return com.epa.epadiplom.authentication.auth.AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public com.epa.epadiplom.authentication.auth.AuthenticationResponse authenticate(
            AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getLogin(),
                        request.getPassword()
                )
        );
        var user = userRepo.findByFirstName(request.getLogin())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return com.epa.epadiplom.authentication.auth.AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
