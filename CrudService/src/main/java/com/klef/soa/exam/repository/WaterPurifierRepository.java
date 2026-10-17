package com.klef.soa.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.soa.exam.entity.WaterPurifier;

public interface WaterPurifierRepository extends JpaRepository<WaterPurifier, Long> {

}
