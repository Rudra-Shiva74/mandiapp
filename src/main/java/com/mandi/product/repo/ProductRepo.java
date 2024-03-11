package com.mandi.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mandi.product.model.ProductInfo;

@Repository
public interface ProductRepo extends JpaRepository<ProductInfo, Long> {

}
