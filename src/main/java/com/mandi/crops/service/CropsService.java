package com.mandi.crops.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.mandi.crops.model.CropsInfo;

@Service
public interface CropsService {
	public CropsInfo saveCropsInfo(CropsInfo cropsInfo);

	public CropsInfo updateCropsInfo(CropsInfo cropsInfo);

	public List<CropsInfo> getAllCropsInfo();

	public void deleteCropsInfo(Long id);

	public List<CropsInfo> getTopType(String type);

}