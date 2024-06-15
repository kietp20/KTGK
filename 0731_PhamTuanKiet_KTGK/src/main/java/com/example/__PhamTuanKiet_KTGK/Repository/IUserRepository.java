package com.example.__PhamTuanKiet_KTGK.Repository;

import com.example.__PhamTuanKiet_KTGK.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface IUserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username);
}
