package com.mandi.crops.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mandi.crops.model.CropsInfo;

@Repository
public interface CropsRepo extends JpaRepository<CropsInfo, Long> {
	@Query("SELECT u FROM CropsInfo u WHERE u.type=:type ORDER BY u.id DESC LIMIT :top")
	public List<CropsInfo> getTopType(String type, int top);
}
