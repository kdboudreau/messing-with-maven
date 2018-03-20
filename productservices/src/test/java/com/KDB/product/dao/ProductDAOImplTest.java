package com.KDB.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.KDB.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("iPhone");
		product.setDescription("It's awesome");
		product.setPrice(800);		
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("iPhone", result.getName());
	}

}
