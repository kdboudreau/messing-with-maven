package com.KDB.product.bo;

import com.KDB.product.dto.Product;

public interface ProductBO {
	
	public void create(Product product);
	
	public Product findProduct(int id);
	
}
