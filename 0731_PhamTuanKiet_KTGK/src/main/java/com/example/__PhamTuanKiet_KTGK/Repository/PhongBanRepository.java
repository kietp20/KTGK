package com.example.__PhamTuanKiet_KTGK.Repository;

import com.example.__PhamTuanKiet_KTGK.Model.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan, String> {
}
