package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> getProducts() {

		List<Product> productList = new ArrayList<>();

		// Category category = new Category("food");
		//
		// Product apple = new Product("Apple", 100.0, category);
		// Product almond = new Product("Almonds", 150.0, category);
		//
		// productList.add(apple);
		// productList.add(almond);

		return productList;
	}

}
