package com.example.__PhamTuanKiet_KTGK.Repository;


import com.example.__PhamTuanKiet_KTGK.Model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
}
