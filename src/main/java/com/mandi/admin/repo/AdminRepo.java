package com.mandi.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mandi.admin.model.AdminInfo;

@Repository
public interface AdminRepo extends JpaRepository<AdminInfo, Integer> {

	@Query("SELECT u FROM AdminInfo u WHERE u.email = :id AND u.password = :pass")
	public AdminInfo loinAdmin(String id, String pass);

}
