package com.mandi.farmerContact.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.mandi.farmerContact.model.FarmerContactInfo;

@Service
public interface FarmerContactService {
	
   public FarmerContactInfo saveFarmerContactInfo(FarmerContactInfo farmerContactInfo);
   
   public List<FarmerContactInfo> getAllFarmerContactInfo();
   
   public void deleteFarmerContactInfo(Long id);
}
