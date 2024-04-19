package com.mandi.fertilizer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mandi.fertilizer.model.FertilizerInfo;
import com.mandi.fertilizer.repo.FertilizerRepo;

@Component
public class FertilizerServiceImp implements FertilizerService {
	@Autowired
	private FertilizerRepo fertilizerRepo;

	@Override
	public List<FertilizerInfo> getAllFertilizerInfo() {
		return this.fertilizerRepo.findAll();
	}

	@Override
	public FertilizerInfo saveFertilizerInfo(FertilizerInfo fertilizerInfo) {
		return this.fertilizerRepo.save(fertilizerInfo);
	}

	@Override
	public FertilizerInfo updateFertilizerInfo(FertilizerInfo fertilizerInfo) {
		return this.fertilizerRepo.saveAndFlush(fertilizerInfo);
	}



	@Override
	public FertilizerInfo deleteFertilizerInfo(Long id) {
		
		this.fertilizerRepo.deleteById(id);
		return null;
	}
	
	

	

}