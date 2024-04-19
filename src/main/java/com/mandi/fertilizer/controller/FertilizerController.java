package com.mandi.fertilizer.controller;

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

import com.mandi.fertilizer.model.FertilizerInfo;
import com.mandi.fertilizer.service.FertilizerService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FertilizerController {
	@Autowired
	private FertilizerService fertilizerService;

//	@PostMapping("/fertilizer")
//	public FertilizerInfo saveFertilizerInfo(@RequestBody FertilizerInfo fertilizerInfo) {
//		return this.fertilizerService.saveFertilizerInfo(fertilizerInfo);
//	}
	
	@PostMapping("/fertilizer")
	public FertilizerInfo saveFertilizer(@RequestParam("name") String name,
	                                     @RequestParam("price") int price,
	                                     @RequestParam("qnt") int qnt,
	                                     @RequestParam("farmerid") String farmerid,
	                                     @RequestParam("state") String state,
	                                     @RequestParam("type") String type,
	                                     @RequestParam("image") MultipartFile file) throws IOException {

	    FertilizerInfo fertilizer = new FertilizerInfo();
	    fertilizer.setName(name);
	    fertilizer.setPrice(price);
	    fertilizer.setQnt(qnt);
	    fertilizer.setFarmerid(farmerid);
	    fertilizer.setState(state);
	    fertilizer.setType(type);

	    if (!file.isEmpty()) {
	        try {
	            String uploadDir = "src/main/resources/static/fertilizer/";
	            File dir = new File(uploadDir);
	            if (!dir.exists()) {
	                dir.mkdirs();
	            }
	            String fileName = file.getOriginalFilename();
	            File uploadedFile = new File(uploadDir + fileName);
	            try (FileOutputStream fos = new FileOutputStream(uploadedFile)) {
	                fos.write(file.getBytes());
	            }
	            fertilizer.setImage(fileName);
	        } catch (IOException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Failed to upload image!");
	        }
	    }

	    return fertilizerService.saveFertilizerInfo(fertilizer);
	}

	

	@PutMapping("/fertilizer")
	public FertilizerInfo updateFertilizerInfo(@RequestBody FertilizerInfo fertilizerInfo) {
		return this.fertilizerService.updateFertilizerInfo(fertilizerInfo);
	}

	@GetMapping("/fertilizer")
	public List<FertilizerInfo> getAllFertilizerInfo() {
		return this.fertilizerService.getAllFertilizerInfo();
	}
	
	@DeleteMapping("/fertilizer/{id}")
	
	public void deleteFertlizerInfo(@PathVariable("id")long id) {
		this.fertilizerService.deleteFertilizerInfo(id);
	}
	
	
	
}