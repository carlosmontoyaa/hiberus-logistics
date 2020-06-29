package com.example.hiberuslogistics.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hiberuslogistics.entity.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Long> {

}
