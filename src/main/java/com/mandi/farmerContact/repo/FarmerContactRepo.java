package com.mandi.farmerContact.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mandi.farmerContact.model.FarmerContactInfo;

@Repository
public interface FarmerContactRepo extends JpaRepository<FarmerContactInfo, Long>{


}
