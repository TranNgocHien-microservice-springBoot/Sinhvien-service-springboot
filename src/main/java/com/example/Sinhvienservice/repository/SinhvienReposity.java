package com.example.Sinhvienservice.repository;

import com.example.Sinhvienservice.entity.Sinhvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SinhvienReposity extends JpaRepository<Sinhvien, Long> {
}
