package com.example.spring_boot_jwt_doanthithanhhong.reponsitory;

import com.example.spring_boot_jwt_doanthithanhhong.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
