package com.mandi.product.service;

import java.util.List;

import com.mandi.product.model.ProductInfo;

public interface ProductService {
	public boolean saveProductInfo(ProductInfo productInfo);

	public boolean updateProductInfo(ProductInfo productInfo);

	public List<ProductInfo> getAllProductInfo();
}
