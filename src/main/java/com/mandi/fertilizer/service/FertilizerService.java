package com.mandi.fertilizer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mandi.fertilizer.model.FertilizerInfo;
@Service
public interface FertilizerService {
	public List<FertilizerInfo> getAllFertilizerInfo();

	public FertilizerInfo saveFertilizerInfo(FertilizerInfo fetFertilizerInfo);

	public FertilizerInfo updateFertilizerInfo(FertilizerInfo fetFertilizerInfo);
}
