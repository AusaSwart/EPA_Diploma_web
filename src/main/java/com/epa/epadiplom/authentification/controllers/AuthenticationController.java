package com.epa.epadiplom.authentification.controllers;


import com.epa.epadiplom.authentification.auth.AuthenticationRequest;
import com.epa.epadiplom.authentification.auth.AuthenticationResponse;
import com.epa.epadiplom.authentification.auth.AuthenticationService;
import com.epa.epadiplom.authentification.auth.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register (
            @RequestBody RegisterRequest request){
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate (
            @RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }

    @GetMapping("/authorization")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from secured endpoint ");
    }

}
