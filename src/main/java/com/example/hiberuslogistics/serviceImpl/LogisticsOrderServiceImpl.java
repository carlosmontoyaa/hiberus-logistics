package com.example.hiberuslogistics.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hiberuslogistics.dao.OrderSentDao;
import com.example.hiberuslogistics.dao.ProductDao;
import com.example.hiberuslogistics.dto.BillDto;
import com.example.hiberuslogistics.dto.OrderDto;
import com.example.hiberuslogistics.dto.SentOrderDto;
import com.example.hiberuslogistics.entity.Product;
import com.example.hiberuslogistics.entity.SentOrder;
import com.example.hiberuslogistics.service.LogisticsOrderService;

@Service
public class LogisticsOrderServiceImpl implements LogisticsOrderService {

	@Autowired
	private OrderSentDao orderSentDao;

	@Autowired
	private ProductDao productDao;

	/*
	 * The logistics service generate a sent order that is the order and the bill
	 * with his products.
	 * 
	 * I save the info of the sent order in a database in h2 local
	 * 
	 * 
	 */
	@Override
	public void generateSentOrder(SentOrderDto sentOrderDto) {

		BillDto billDto = sentOrderDto.getBillDto();
		OrderDto orderDto = sentOrderDto.getOrderDto();

		SentOrder sentOrder = new SentOrder();
		sentOrder.setClientID(orderDto.getClientID().longValue());
		sentOrder.setDate(orderDto.getDate());
		sentOrder.setDirection(orderDto.getDirection());
		sentOrder.setIdBill(billDto.getId().longValue());
		sentOrder.setQuantityProducts(billDto.getQuantityProducts().longValue());
		sentOrder.setCostTotal(billDto.getCostTotal().longValue());

		orderSentDao.save(sentOrder);

		orderDto.getProductDtoList().stream().forEach(productDto -> {
			Product product = new Product();
			product.setClientID(orderDto.getClientID().longValue());
			product.setCost(productDto.getCost().longValue());
			product.setDate(orderDto.getDate());
			product.setIdBill(billDto.getId().longValue());
			product.setQuantity(productDto.getQuantity().longValue());

			productDao.save(product);

		});

	}

}
