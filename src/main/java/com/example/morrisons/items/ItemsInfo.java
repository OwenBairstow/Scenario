package com.example.morrisons.items;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.morrisons.order.Order;

@Entity
//@Table(name = "\"Items\"")

// class stores all of the Item information

public class ItemsInfo {
	/*
	 * itemId": "106571637",
      "itemLineId": 1,
      "itemBaseType": "skuMin",
      itemDescription": "Heinz Baked Beans", 
      "quantityType": "unit", 
      "quantityOrdered": 30, 
      "priceOrderedCurrency": "GBP", 
      "priceOrderedAmount": 1.34, 
     "priceOrderedTaxRate": 20
	 */
	@Id
	private long itemId;
	private int itemLineId;
	private String itemBaseType;
	private String itemDescription;
	private String quantityType;
	private int quantityOrdered;
	private String priceOrderedCurrency;
	private double priceOrderedAmount;
	private int priceOrderedTaxRate;
	@ManyToOne
	@JoinColumn(name = "Order_ID")
	private Order order;
	
	


// constructors
	public ItemsInfo() {
		
	}
	
	

	public ItemsInfo(long itemId, int itemLineId, String itemBaseType, String itemDescription, String quantityType,
			int quantityOrdered, String priceOrderedCurrency, double priceOrderedAmount, int priceOrderedTaxRate) {
		super();
		this.itemId = itemId;
		this.itemLineId = itemLineId;
		this.itemBaseType = itemBaseType;
		this.itemDescription = itemDescription;
		this.quantityType = quantityType;
		this.quantityOrdered = quantityOrdered;
		this.priceOrderedCurrency = priceOrderedCurrency;
		this.priceOrderedAmount = priceOrderedAmount;
		this.priceOrderedTaxRate = priceOrderedTaxRate;
	}

// getters and setters

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public int getItemLineId() {
		return itemLineId;
	}

	public void setItemLineId(int itemLineId) {
		this.itemLineId = itemLineId;
	}

	public String getItemBaseType() {
		return itemBaseType;
	}

	public void setItemBaseType(String itemBaseType) {
		this.itemBaseType = itemBaseType;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getQuantityType() {
		return quantityType;
	}

	public void setQuantityType(String quantityType) {
		this.quantityType = quantityType;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public String getPriceOrderedCurrency() {
		return priceOrderedCurrency;
	}

	public void setPriceOrderedCurrency(String priceOrderedCurrency) {
		this.priceOrderedCurrency = priceOrderedCurrency;
	}

	public double getPriceOrderedAmount() {
		return priceOrderedAmount;
	}

	public void setPriceOrderedAmount(double priceOrderedAmount) {
		this.priceOrderedAmount = priceOrderedAmount;
	}

	public int getPriceOrderedTaxRate() {
		return priceOrderedTaxRate;
	}

	public void setPriceOrderedTaxRate(int priceOrderedTaxRate) {
		this.priceOrderedTaxRate = priceOrderedTaxRate;
	}
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	


	
	
}
