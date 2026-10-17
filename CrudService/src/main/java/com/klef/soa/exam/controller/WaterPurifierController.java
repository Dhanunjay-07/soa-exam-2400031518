package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.WaterPurifier;
import com.klef.soa.exam.service.WaterPurifierService;

@RestController
@RequestMapping("/wp")
public class WaterPurifierController 
{
	@Autowired
	private WaterPurifierService service;
	
	@GetMapping("/")
	public String test()
	{
		return "WaterPurifier Project";
	}
@PostMapping("/add")
  public ResponseEntity<WaterPurifier> addpurifier( @RequestBody WaterPurifier wp)
  {
	  return new ResponseEntity<>(service.addPurifier(wp),HttpStatus.CREATED);
  }
@GetMapping("/displayall")
   public ResponseEntity<List<WaterPurifier>> displayAll()
   {
	   return ResponseEntity.ok(service.displayAll());
   }
@DeleteMapping("/delete{id}")
   public ResponseEntity<String> deletebyid(@PathVariable Long id)
   {
	   return ResponseEntity.ok(service.deleteWaterPurifier(id));
   }
}
