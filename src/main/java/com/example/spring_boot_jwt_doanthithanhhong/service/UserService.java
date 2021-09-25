package com.example.spring_boot_jwt_doanthithanhhong.service;


import com.example.spring_boot_jwt_doanthithanhhong.entity.User;
import com.sun.security.auth.UserPrincipal;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User createUser(User user);


    UserPrincipal findByUsername(String username);
}
