package com.mandi.admin.service;

import org.springframework.stereotype.Service;

import com.mandi.admin.model.AdminInfo;

@Service
public interface AdminService {
	public AdminInfo loginAdmin(String id, String pass);

	public boolean updateAdmin(AdminInfo adminInfo);
}
