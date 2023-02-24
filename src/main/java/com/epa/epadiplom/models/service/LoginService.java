package com.epa.epadiplom.models.service;

import com.epa.epadiplom.models.entities.Login;
import com.epa.epadiplom.models.repositories.LoginRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements UserDetailsService {
    // Here's another one layer of abstraction nd control
    // Methods
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
    private final LoginRepo repository;
    public LoginService(LoginRepo repository) {
        this.repository = repository;
    }

    public Login getByLogin(String login) {
        return this.repository.getByLogin(login);
    }

}
