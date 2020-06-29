package com.example.hiberuslogistics.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRODUCT")
public class Product {

	@Id
	@GeneratedValue
	@Column(name = "Id", nullable = false)
	private Long id;

	@Column(name = "Client_Id", nullable = false)
	private Long clientID;

	@Column(name = "Id_Bill", nullable = false)
	private Long idBill;

	@Temporal(TemporalType.DATE)
	@Column(name = "Date", nullable = false)
	private Date date;

	@Column(name = "Quantity", nullable = false)
	private Long quantity;

	@Column(name = "Cost", nullable = false)
	private Long cost;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getClientID() {
		return clientID;
	}

	public void setClientID(Long clientID) {
		this.clientID = clientID;
	}

	public Long getIdBill() {
		return idBill;
	}

	public void setIdBill(Long idBill) {
		this.idBill = idBill;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

}
