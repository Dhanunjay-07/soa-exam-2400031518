package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.WaterPurifier;

public interface WaterPurifierService 
{
 WaterPurifier addPurifier(WaterPurifier wp);
 
 List<WaterPurifier> displayAll();
 
 String deleteWaterPurifier(Long id);
}
