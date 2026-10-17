package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.WaterPurifier;
import com.klef.soa.exam.repository.WaterPurifierRepository;

@Service

public class WaterPurifierServiceImplementation implements WaterPurifierService
{
   @Autowired
   private WaterPurifierRepository repo;
	@Override
	public WaterPurifier addPurifier(WaterPurifier wp) {
		return repo.save(wp) ;
	}

	@Override
	public List<WaterPurifier> displayAll() {
		return repo.findAll();
	}

	@Override
	public String deleteWaterPurifier(Long id) 
	{
		if(!repo.existsById(id))
		{
			return "id not found :"+id;
		}
		 repo.deleteById(id);
		 return "id  deleted succesfully with id :"+id;
	}

}
