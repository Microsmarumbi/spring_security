package com.compsciezimsecurity.compsciezimsecurity.repo;

import com.compsciezimsecurity.compsciezimsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.InterfaceAddress;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String username);
}

