package com.example.__PhamTuanKiet_KTGK.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "NHANVIEN")
public class NhanVien {

    @Id
    @NotNull(message = "not null")
    private String id;

    @NotNull(message = "not null")
    private String tenNV;

    private String phai;

    private String noiSinh;

    @ManyToOne
    @JoinColumn(name = "phongban_id")
    private PhongBan phongban;

    private int Luong;
}