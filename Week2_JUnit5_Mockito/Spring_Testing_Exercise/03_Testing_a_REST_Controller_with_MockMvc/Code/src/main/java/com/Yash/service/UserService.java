package com.Yash.service;

import com.Yash.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUserById(Long id){
        return new User(id, "Yash");
    }
}