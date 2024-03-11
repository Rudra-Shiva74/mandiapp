package com.mandi.crops.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mandi.crops.model.CropsInfo;

@Repository
public interface CropsRepo extends JpaRepository<CropsInfo, Long> {

}
