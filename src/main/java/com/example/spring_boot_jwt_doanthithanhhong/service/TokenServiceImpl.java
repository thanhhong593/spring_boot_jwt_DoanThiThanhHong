package com.example.spring_boot_jwt_doanthithanhhong.service;

import com.example.spring_boot_jwt_doanthithanhhong.entity.Token;
import com.example.spring_boot_jwt_doanthithanhhong.reponsitory.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}

