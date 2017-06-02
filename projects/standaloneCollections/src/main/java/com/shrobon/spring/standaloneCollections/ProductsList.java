package com.shrobon.spring.standaloneCollections;

import java.util.List;

public class ProductsList {
	//This is a POJO class that will have a list of string containing product names 
	private List<String> productNames;

	public List<String> getProductNames() {
		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}

	@Override
	public String toString() {
		return "ProductsList [productNames=" + productNames + "]";
	}
	
	
	
}
