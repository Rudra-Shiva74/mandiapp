package com.mandi.crops.controller;

import java.io.File;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartFile;

import com.mandi.animal.model.AnimalInfo;
import com.mandi.crops.model.CropsInfo;
import com.mandi.crops.service.CropsService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CropsController {
	@Autowired
	private CropsService cropsService;


	@PostMapping("/crops")
	public CropsInfo saveCrops(@RequestParam("name") String name,
	                           @RequestParam("price") int price,
	                           @RequestParam("qnt") int qnt,
	                           @RequestParam("type") String type,
	                           @RequestParam("farmerid") String farmerid,
	                           @RequestParam("state") String state,
	                           @RequestParam("variety") String variety,
	                           @RequestParam("image") MultipartFile file) throws IOException {

	    CropsInfo crop = new CropsInfo();
	    crop.setName(name);
	    crop.setPrice(price);
	    crop.setQnt(qnt);
	    crop.setType(type); // Setting the type
	    crop.setFarmerid(farmerid);
	    crop.setState(state);
	    crop.setVariety(variety);

	    if (!file.isEmpty()) {
	        try {
	            String uploadDir = "src/main/resources/static/crops/";
	            File dir = new File(uploadDir);
	            if (!dir.exists()) {
	                dir.mkdirs();
	            }
	            String fileName = file.getOriginalFilename();
	            File uploadedFile = new File(uploadDir + fileName);
	            try (FileOutputStream fos = new FileOutputStream(uploadedFile)) {
	                fos.write(file.getBytes());
	            }
	            crop.setImage(fileName);
	        } catch (IOException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Failed to upload image!");
	        }
	    }

	    return cropsService.saveCropsInfo(crop);
	}

	

	@PutMapping("/crops")
	public CropsInfo updateCropsInfo(@RequestBody CropsInfo cropsInfo) {
		return this.cropsService.updateCropsInfo(cropsInfo);
	}

	@GetMapping("/crops")
	public List<CropsInfo> getAllCrops() {
		return this.cropsService.getAllCropsInfo();
	}
	
	
	@DeleteMapping("/crops/{id}")
	public void deleteCrops(@PathVariable("id")Long id) {
		
		cropsService.deleteCropsInfo(id);
	}
	
	@GetMapping("/croptopname/{type}")
	public List<CropsInfo> getTopName(@PathVariable("type") String type) {
		return this.cropsService.getTopType(type);
	}
	

}