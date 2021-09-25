package com.example.spring_boot_jwt_doanthithanhhong.service;

import com.example.spring_boot_jwt_doanthithanhhong.entity.Token;
import org.springframework.stereotype.Service;

@Service
public interface TokenService {
    Token findByToken(String jwt);
    Token createToken(Token token);
}
