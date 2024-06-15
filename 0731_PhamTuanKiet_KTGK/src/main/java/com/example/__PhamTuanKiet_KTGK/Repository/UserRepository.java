package com.example.__PhamTuanKiet_KTGK.Repository;

import com.example.__PhamTuanKiet_KTGK.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
