package com.mandi.farmer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mandi.farmer.model.FarmerInfo;

@Service
public interface FarmerService {
	public FarmerInfo savaFarmer(FarmerInfo farmerInfo);

	public FarmerInfo loginFarmer(String farmerid, String password);

	public List<FarmerInfo> getAllFarmer();

	public boolean updateFarmer(FarmerInfo farmerInfo);

	public boolean deleteFarmer(Long id);

	public int updatePassword(String id, String oldPass, String newPass);
}
