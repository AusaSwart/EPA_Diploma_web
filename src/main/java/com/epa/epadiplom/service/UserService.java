package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.User;
import com.epa.epadiplom.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findUserByFirstName(String login) {
        return userRepository.findByFirstName(login).orElseThrow();
    }

    public List<User> allUsers() {
        return userRepository.findAll();
    }

    public boolean saveUser(User user) {
        if(userRepository.findByFirstName(user.getFirstName()).isPresent())
            return false;
        userRepository.save(user);
        return true;
    }
}
