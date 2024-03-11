package com.mandi.farmer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mandi.farmer.model.FarmerInfo;
import com.mandi.farmer.model.LoginFarmer;
import com.mandi.farmer.service.FarmerService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FarmerController {
	@Autowired
	private FarmerService farmerService;

	@PostMapping("/farmer")
	public FarmerInfo saveFarmer(@RequestBody FarmerInfo farmerInfo) {
		System.out.println(farmerInfo);
		return this.farmerService.savaFarmer(farmerInfo);
	}

	@PostMapping("/login")
	public ResponseEntity<?> loginFarmer(@RequestBody LoginFarmer loginFarmer) {
		FarmerInfo farmerInfo = this.farmerService.loginFarmer(loginFarmer.getFarmerid(),
				loginFarmer.getFarmerpassword());
		System.out.println(farmerInfo.toString());
		return ResponseEntity.ok(farmerInfo);
	}

	@GetMapping("/farmer")
	public List<FarmerInfo> getAllFarmer() {
		return this.farmerService.getAllFarmer();
	}
}
