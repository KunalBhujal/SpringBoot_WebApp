package com.ecommerce.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ecommerce.app.model.EcomEntity;
import com.ecommerce.app.repository.EcomRepository;

@Service
public class EcomService {
	
	@Autowired
	private EcomRepository ecomRepo;
	
	
//	private List<Ecom_entity> users = new ArrayList<>(Arrays.asList(
//			new Ecom_entity("chandlerb@gmail.com", "Chandler", "Bing", "admin","1"),
//			new Ecom_entity("rossg@gmail.com", "Ross", "Geller", "customer","2")));
//	
//	private List<Ecom_productsEntity> products = new ArrayList<>(Arrays.asList(
//			new Ecom_productsEntity("Apple iphone 11", "iphone 11, 136 GB, Jet black", "700 $"),
//			new Ecom_productsEntity("Samsung Galaxy A11", "Samsung Galaxy A11, 128 GB, Blue", "500 $")));

	public List<EcomEntity> adminUser() {
		List<EcomEntity> adminuser = new ArrayList<>();
		ecomRepo.findAll().forEach(adminuser::add);
		return adminuser;
	}

	public void addUsers(EcomEntity userEntity) {
		ecomRepo.save(userEntity);
		
	}
/*
	public void addProducts(Ecom_productsEntity ecomprodent) {
		 products.add(ecomprodent);
		
	}

	public List<Ecom_productsEntity> getAllProducts() {
		return products;
	}
*/
	


}
