package com.mandi.farmer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mandi.farmer.model.FarmerInfo;
import com.mandi.farmer.repo.FarmerRepo;

@Component
public class FarmerServiceImp implements FarmerService {

	@Autowired
	private FarmerRepo farmerRepo;

	@Override
	public List<FarmerInfo> getAllFarmer() {
		return this.farmerRepo.findAll();
	}

	@Override
	public boolean updateFarmer(FarmerInfo farmerInfo) {
		try {
			this.farmerRepo.saveAndFlush(farmerInfo);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public FarmerInfo savaFarmer(FarmerInfo farmerInfo) {
		try {
			return this.farmerRepo.save(farmerInfo);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public FarmerInfo loginFarmer(String farmerid, String password) {
		FarmerInfo farmerInfo = this.farmerRepo.getFarmerByidAndpass(farmerid, password);
		if (farmerInfo != null) {
			return farmerInfo;
		}
		throw new RuntimeException("Invalid Farmerid or Password..!");
	}

	@Override
	public boolean deleteFarmer(Long id) {
		try {
			this.farmerRepo.deleteById(id);
		} catch (Exception e) {
			throw new RuntimeException("No User Exist..!");
		}
		return false;
	}

	@Override
	public int updatePassword(String id, String oldPass, String newPass) {
		System.out.println(id);
		return this.farmerRepo.updatePassword(id, oldPass, newPass);
	}

}
