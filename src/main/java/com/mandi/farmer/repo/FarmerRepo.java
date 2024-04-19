package com.mandi.farmer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mandi.farmer.model.FarmerInfo;

import jakarta.transaction.Transactional;

@Repository
public interface FarmerRepo extends JpaRepository<FarmerInfo, Long> {

	@Query("SELECT u FROM FarmerInfo u WHERE u.farmerid = :id AND u.password = :pass")
	public FarmerInfo getFarmerByidAndpass(String id, String pass);

	public FarmerInfo getFarmerBystate(String pass);

	@Modifying
	@Transactional
	@Query("UPDATE FarmerInfo u SET u.password = :newPass WHERE u.farmerid = :id AND u.password = :oldPass")
	public int updatePassword(String id, String oldPass, String newPass);

}
