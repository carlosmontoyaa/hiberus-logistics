package com.example.hiberuslogistics.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hiberuslogistics.entity.SentOrder;

@Repository
public interface OrderSentDao extends CrudRepository<SentOrder, Long> {

}
