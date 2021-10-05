package com.example.Sinhvienservice.VO;

import com.example.Sinhvienservice.entity.Sinhvien;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseTemplateVO {
    private Sinhvien sinhvien;
    private Khoa khoa;
}
