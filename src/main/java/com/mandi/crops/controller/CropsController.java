package com.mandi.crops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mandi.crops.model.CropsInfo;
import com.mandi.crops.service.CropsService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CropsController {
	@Autowired
	private CropsService cropsService;

	@PostMapping("/crops")
	public CropsInfo saveCropsInfo(@RequestBody CropsInfo cropsInfo) {
		return this.cropsService.saveCropsInfo(cropsInfo);
	}

	@PutMapping("/crops")
	public CropsInfo updateCropsInfo(@RequestBody CropsInfo cropsInfo) {
		return this.cropsService.updateCropsInfo(cropsInfo);
	}

	@GetMapping("/crops")
	public List<CropsInfo> getAllCrops() {
		return this.cropsService.getAllCropsInfo();
	}

}
