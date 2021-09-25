package com.example.spring_boot_jwt_doanthithanhhong.reponsitory;

import com.example.spring_boot_jwt_doanthithanhhong.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
