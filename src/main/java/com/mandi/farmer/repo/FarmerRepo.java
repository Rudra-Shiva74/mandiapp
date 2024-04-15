package com.mandi.farmer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mandi.farmer.model.FarmerInfo;

@Repository
public interface FarmerRepo extends JpaRepository<FarmerInfo, Long> {

	@Query("SELECT u FROM FarmerInfo u WHERE u.farmerid = :id AND u.password = :pass")
	public FarmerInfo getFarmerByidAndpass(String id, String pass);

	public FarmerInfo getFarmerBystate(String pass);

}
