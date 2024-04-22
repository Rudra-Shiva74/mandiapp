package com.mandi.farmerContact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mandi.farmerContact.model.FarmerContactInfo;
import com.mandi.farmerContact.service.FarmerContactService;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class FarmerContactController {
	
     @Autowired
	private FarmerContactService farmerContactService ;
      
      @PostMapping("/farmercontact")
     public  FarmerContactInfo saveFarmerContactInfo(@RequestBody FarmerContactInfo farmerContactInfo ) {
    	 return this.farmerContactService.saveFarmerContactInfo(farmerContactInfo);
     }
 
     @GetMapping("/farmercontact")
     public  List<FarmerContactInfo> getAllFarmerContactInfo(){
    	 return this.farmerContactService.getAllFarmerContactInfo();
     }
     
     @DeleteMapping("/farmercontact/{id}")
     public void deleteFarmercontactInfo(@PathVariable("id")long id ) {
    	 this.farmerContactService.deleteFarmerContactInfo(id);
     }
      
}


