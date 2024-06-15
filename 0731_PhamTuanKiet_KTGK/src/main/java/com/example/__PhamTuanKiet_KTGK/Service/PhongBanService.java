package com.example.__PhamTuanKiet_KTGK.Service;


import com.example.__PhamTuanKiet_KTGK.Model.PhongBan;
import com.example.__PhamTuanKiet_KTGK.Repository.PhongBanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhongBanService {

    public final PhongBanRepository phongBanRepository;

    public List<PhongBan> getAllPhongBan()
    {
        return phongBanRepository.findAll();
    }
}