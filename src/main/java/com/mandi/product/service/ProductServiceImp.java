package com.mandi.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mandi.product.model.ProductInfo;
import com.mandi.product.repo.ProductRepo;

public class ProductServiceImp implements ProductService {
	@Autowired
	private ProductRepo productRepo;

	@Override
	public boolean saveProductInfo(ProductInfo productInfo) {
		try {
			this.productRepo.save(productInfo);
			return true;
		} catch (Exception e) {
			throw new RuntimeException("Something is Wrong..!");
		}
	}

	@Override
	public boolean updateProductInfo(ProductInfo productInfo) {
		try {
			this.productRepo.saveAndFlush(productInfo);
			return true;
		} catch (Exception e) {
			throw new RuntimeException("Something is Wrong..!");
		}
	}

	@Override
	public List<ProductInfo> getAllProductInfo() {
		return this.productRepo.findAll();
	}

}
