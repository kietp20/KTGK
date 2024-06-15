package com.example.__PhamTuanKiet_KTGK.Repository;

import com.example.__PhamTuanKiet_KTGK.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {
    Role findRoleById(Long id);

}
