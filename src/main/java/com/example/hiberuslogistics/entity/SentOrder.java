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
@Table(name = "SENT_ORDER")
public class SentOrder {

	@Id
	@GeneratedValue
	@Column(name = "Id", nullable = false)
	private Long id;

	@Column(name = "Client_Id", nullable = false)
	private Long clientID;

	@Temporal(TemporalType.DATE)
	@Column(name = "Date", nullable = false)
	private Date date;

	@Column(name = "Direction", nullable = false)
	private String direction;

	@Column(name = "Id_Bill", nullable = false)
	private Long idBill;

	@Column(name = "Quantity_Products", nullable = false)
	private Long quantityProducts;

	@Column(name = "Total_Cost", nullable = false)
	private Long costTotal;

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Long getIdBill() {
		return idBill;
	}

	public void setIdBill(Long idBill) {
		this.idBill = idBill;
	}

	public Long getQuantityProducts() {
		return quantityProducts;
	}

	public void setQuantityProducts(Long quantityProducts) {
		this.quantityProducts = quantityProducts;
	}

	public Long getCostTotal() {
		return costTotal;
	}

	public void setCostTotal(Long costTotal) {
		this.costTotal = costTotal;
	}

}
