package com.mandi.crops.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mandi.crops.model.CropsInfo;
import com.mandi.crops.repo.CropsRepo;

@Component
public class CropsServiceImp implements CropsService {

	@Autowired
	private CropsRepo cropsRepo;

	@Override
	public CropsInfo saveCropsInfo(CropsInfo cropsInfo) {
		return this.cropsRepo.save(cropsInfo);
	}

	@Override
	public CropsInfo updateCropsInfo(CropsInfo cropsInfo) {
		return this.cropsRepo.saveAndFlush(cropsInfo);
	}

	@Override
	public List<CropsInfo> getAllCropsInfo() {
		return this.cropsRepo.findAll();
	}


	@Override
	public void deleteCropsInfo(Long id) {
	
		this.cropsRepo.deleteById(id);
		
	}
	
	

	
	

}