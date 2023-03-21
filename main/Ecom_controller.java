package com.ecommerce.app.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api")
@RestController
public class Ecom_controller {
	
	@Autowired
	private Ecom_service ecomservice;

	@RequestMapping("/user")
	public List<Ecom_entity> adminUser(){
		return ecomservice.adminUser();
	}
	
	@RequestMapping("/customer/signup")
	public String customerSignup(){
		return "You have signed-up successfully";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/adduser")
	public void addUsers(@RequestBody Ecom_entity userEntity) {
		ecomservice.addUsers(userEntity);
	}
	/*
	@PreAuthorize("hasAuthority('ROLE_Admin')")
	@RequestMapping(method = RequestMethod.POST, value="/products" )
	public void addProducts(@RequestBody Ecom_productsEntity ecomprodent){
		ecomservice.addProducts(ecomprodent);
	}
	
	@PreAuthorize("hasAuthority('ROLE_Customer')")
	@RequestMapping("/products/order")
	public List<Ecom_productsEntity> getAllProducts(){
		return ecomservice.getAllProducts();
		}*/
}
