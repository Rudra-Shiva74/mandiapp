package com.mandi.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mandi.admin.model.AdminInfo;
import com.mandi.admin.repo.AdminRepo;

@Component
public class AdminServiceImp implements AdminService {

	@Autowired
	private AdminRepo adminRepo;

	@Override
	public AdminInfo loginAdmin(String id, String pass) {
		return this.adminRepo.loinAdmin(id, pass);
	}

}
