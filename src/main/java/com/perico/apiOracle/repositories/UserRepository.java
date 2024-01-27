package com.perico.apiOracle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.perico.apiOracle.classes.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2")
    void findByEmailAndPassword(String email, String password);
}
