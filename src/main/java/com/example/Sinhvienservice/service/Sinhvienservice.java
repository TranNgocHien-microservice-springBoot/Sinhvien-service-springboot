package com.example.Sinhvienservice.service;

import com.example.Sinhvienservice.VO.Khoa;
import com.example.Sinhvienservice.VO.ResponseTemplateVO;
import com.example.Sinhvienservice.entity.Sinhvien;
import com.example.Sinhvienservice.repository.SinhvienReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class Sinhvienservice {

    @Autowired
    private SinhvienReposity sinhvienReposity;
    @Autowired
    private RestTemplate restTemplate;

    public Sinhvien saveSinhvien(Sinhvien sinhvien) {
        return sinhvienReposity.save(sinhvien);
    }

    public ResponseTemplateVO getSinhvienWithKhoa(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Sinhvien sinhvien = sinhvienReposity.findById(userId).get();
        vo.setSinhvien(sinhvien);
        Khoa khoa =
                restTemplate.getForObject("http://localhost:9001/department/"
                                + sinhvien.getDepartmentId(),
                        Khoa.class);

        vo.setKhoa(khoa);

        return vo;
    }
}
