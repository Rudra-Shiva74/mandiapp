package com.mandi.farmerContact.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mandi.farmerContact.model.FarmerContactInfo;
import com.mandi.farmerContact.repo.FarmerContactRepo;
@Component
public class FarmerContactServiceImpl implements FarmerContactService{
	
	@Autowired
	private FarmerContactRepo farmerContactRepo;

	@Override
	public FarmerContactInfo saveFarmerContactInfo(FarmerContactInfo farmerContactInfo) {
		
		return this.farmerContactRepo.save(farmerContactInfo);
	}

	@Override
	public List<FarmerContactInfo> getAllFarmerContactInfo() {
		return this.farmerContactRepo.findAll();
	}

	@Override
	public void deleteFarmerContactInfo(Long id) {
		
		this.farmerContactRepo.deleteById(id);
		
	}

}
