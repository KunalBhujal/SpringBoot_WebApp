package com.ecommerce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ecommerce.app.model.EcomEntity;


@Repository
public interface EcomRepository extends JpaRepository<EcomEntity, String>{

}
