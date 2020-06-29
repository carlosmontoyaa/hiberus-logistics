package com.example.hiberuslogistics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hiberuslogistics.dto.SentOrderDto;
import com.example.hiberuslogistics.service.LogisticsOrderService;

@RestController
public class LogisticOrderController {

	HttpHeaders headers;

	public LogisticOrderController() {
		headers = new HttpHeaders();
		headers.add("Content-Type", "application/json; charset=utf-8");
	}

	@Autowired
	private LogisticsOrderService logisticsOrderService;

	/**
	 * 
	 * @param sentOrderDto
	 */
	@PostMapping(path = "/")
	public @ResponseBody ResponseEntity<Void> logisticsOrder(@RequestBody SentOrderDto sentOrderDto) {

		logisticsOrderService.generateSentOrder(sentOrderDto);

		return new ResponseEntity<>(HttpStatus.OK);
	}
}
