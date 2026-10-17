package com.klef.soa.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="waterpurifier")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WaterPurifier 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String brand;
private String modelName;
private double price;
private boolean installed;
}
