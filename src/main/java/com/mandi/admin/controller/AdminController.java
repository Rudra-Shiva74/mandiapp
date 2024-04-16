package com.mandi.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mandi.admin.model.AdminInfo;
import com.mandi.admin.model.AdminLogin;
import com.mandi.admin.service.AdminService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping("loginadmin")
	public AdminInfo loginadmin(@RequestBody AdminLogin adminLogin) {
		return this.adminService.loginAdmin(adminLogin.getEmail(), adminLogin.getPassword());
	}
}
