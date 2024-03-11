package com.mandi.fertilizer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mandi.fertilizer.model.FertilizerInfo;

@Repository
public interface  FertilizerRepo extends JpaRepository<FertilizerInfo,Long>{

}
