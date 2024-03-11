package com.mandi.fertilizer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mandi.fertilizer.model.FertilizerInfo;
import com.mandi.fertilizer.service.FertilizerService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FertilizerController {
	@Autowired
	private FertilizerService fertilizerService;

	@PostMapping("/fertilizer")
	public FertilizerInfo saveFertilizerInfo(@RequestBody FertilizerInfo fertilizerInfo) {
		return this.fertilizerService.saveFertilizerInfo(fertilizerInfo);
	}

	@PutMapping("/fertilizer")
	public FertilizerInfo updateFertilizerInfo(@RequestBody FertilizerInfo fertilizerInfo) {
		return this.fertilizerService.updateFertilizerInfo(fertilizerInfo);
	}

	@GetMapping("/fertilizer")
	public List<FertilizerInfo> getAllFertilizerInfo() {
		return this.fertilizerService.getAllFertilizerInfo();
	}
}
