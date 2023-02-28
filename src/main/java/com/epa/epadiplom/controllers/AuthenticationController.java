package com.epa.epadiplom.controllers;

import com.epa.epadiplom.auth.AuthenticationRequest;
import com.epa.epadiplom.auth.AuthenticationResponse;
import com.epa.epadiplom.auth.AuthenticationService;
import com.epa.epadiplom.auth.RegisterRequest;
import com.epa.epadiplom.models.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;


@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    private final LoginService service;

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

    // Request of authentification info
//    @GetMapping(path = "/loginInfo", produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody Login getAuthUser(){
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (auth == null) {
//            return null;
//        }
//        Object principal = auth.getPrincipal();
//        Login user = (principal instanceof Login) ? (Login) principal : null;
//        return Objects.nonNull(user) ? this.service.getByLogin(user.getUsername()) : null;
//    }

}