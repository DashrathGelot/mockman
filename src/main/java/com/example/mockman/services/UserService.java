package com.example.mockman.services;

import com.example.mockman.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User createUser(User user) {
        return user;
    }
}
