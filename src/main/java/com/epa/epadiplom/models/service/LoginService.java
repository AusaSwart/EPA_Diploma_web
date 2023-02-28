package com.epa.epadiplom.models.service;

import com.epa.epadiplom.models.entities.Login;
import com.epa.epadiplom.models.repositories.LoginRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

@Service
public class LoginService {}


// {
    // Here's another one layer of abstraction nd control
    // Methods
//    private final LoginRepo loginRepo;
//
//    public LoginService(LoginRepo loginRepo) {
//        this.loginRepo = loginRepo;
//    }
//
//    public Login getByLogin(String login) {
//        return this.loginRepo.getByLogin(login);
//    }
//    private List<Login> logins;
//
//    @Override
//    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
//        Login u = getByLogin(login);
//        if (Objects.isNull(u)) {
//            throw new UsernameNotFoundException(String.format("User %s is not found", login));
//        }
//        return new org.springframework.security.core.userdetails.User(
//                u.getLogin(),
//                u.getPassword(),
//                true,
//                true,
//                true,
//                true,
//                new HashSet<>());
//    }
//
//
//}
