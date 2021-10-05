package com.example.Sinhvienservice.controller;

import com.example.Sinhvienservice.VO.ResponseTemplateVO;
import com.example.Sinhvienservice.entity.Sinhvien;
import com.example.Sinhvienservice.service.Sinhvienservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
//@EnableEurekaClient
public class SinhvienController {
    @Autowired
    private Sinhvienservice sinhvienservice;

    @PostMapping("/")
    public Sinhvien saveSinhvien(@RequestBody Sinhvien sinhvien){

        return sinhvienservice.saveSinhvien(sinhvien);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getSinhvienWithKhoa(@PathVariable("id")
                                                            Long userId){
        return sinhvienservice.getSinhvienWithKhoa(userId);
    }
}
