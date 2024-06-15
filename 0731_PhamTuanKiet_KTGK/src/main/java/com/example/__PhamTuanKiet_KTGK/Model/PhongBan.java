package com.example.__PhamTuanKiet_KTGK.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "PHONGBAN")

public class PhongBan {

    @Id
    @NotNull(message = "not null")
    private String id;


    @NotNull(message = "not null")
    private String tenP;
}