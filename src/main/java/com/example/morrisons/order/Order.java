package com.example.morrisons.order;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.example.morrisons.items.ItemsInfo;

// This class is store all the information on the order 

@Entity
@Table(name = "\"Orders\"")
public class Order {
	
	/*@GeneratedValue
	//@Column(name = "Order_ID",nullable = false, columnDefinition="VARCHAR(64)")
	private int Id;*/
	@Id
	@Column(name = "Order_ID")
	@NotEmpty(message = "Order ID can't be empty")
	private String orderId;
	@Column(name = "Message_Type")
	@NotEmpty(message = "Message Type 1 can't be empty")
	private String messageType;
	@Column(name = "Message_Created")
	@NotEmpty(message = "Message Created can't be empty")
	private String messageCreatedAt;
	@Column(name = "Location_ID")
	@NotEmpty(message = "Location ID can't be empty")
	private String shipToLocationId;
	@Column(name = "Address_Name")
	@NotEmpty(message = "Address Name can't be empty")
	private String shipToAddressName;
	@Column(name = "Address_Line_1")
	@NotEmpty(message = "Address line 1 can't be empty")
	private String shipToAddressLine1;
	@Column(name = "City")
	@NotEmpty(message = "City can't be empty")
	private String shipToAddressCity;
	@Column(name = "Post_Code")
	@NotEmpty(message = "Post Code can't be empty")
	private String shipToAddressPostCode;
	@Column(name = "Country_Code")
	@NotEmpty(message = "Country Code can't be empty")
	private String shipToAddressCountryCode;
	@Column(name = "Ship_To_Deliver")
	@NotEmpty(message = "Ship To Deliver can't be empty")
	private String shipToDeliverAt;
	@Column(name = "Ship_To_Deliver_Latest")
	@NotEmpty(message = "Ship To Deliver Latest can't be empty")
	private String shipToDeliverLatestAt;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotEmpty(message = "Items is missing something")
	private List<ItemsInfo> items = new ArrayList<>();
	
	// constructors
	
	public Order() {
		
	}
	

	public Order( String orderId, String messageType, String messageCreatedAt, String shipToLocationId,
			String shipToAddressName, String shipToAddressLine1, String shipToAddressCity, String shipToAddressPostCode,
			String shipToAddressCountryCode, String shipToDeliverAt, String shipToDeliverLatestAt,List<ItemsInfo> items) {
		super();
		this.orderId = orderId;
		this.messageType = messageType;
		this.messageCreatedAt = messageCreatedAt;
		this.shipToLocationId = shipToLocationId;
		this.shipToAddressName = shipToAddressName;
		this.shipToAddressLine1 = shipToAddressLine1;
		this.shipToAddressCity = shipToAddressCity;
		this.shipToAddressPostCode = shipToAddressPostCode;
		this.shipToAddressCountryCode = shipToAddressCountryCode;
		this.shipToDeliverAt = shipToDeliverAt;
		this.shipToDeliverLatestAt = shipToDeliverLatestAt;
		this.items = items;
	}




// getters and setters 

	public String getOrderID() {
		return orderId;
	}
	public void setOrderID(String orderId) {
		this.orderId = orderId;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessageCreatedAt() {
		return messageCreatedAt;
	}
	public void setMessageCreatedAt(String messageCreatedAt) {
		this.messageCreatedAt = messageCreatedAt;
	}
	public String getShipToLocationId() {
		return shipToLocationId;
	}
	public void setShipToLocationId(String shipToLocationId) {
		this.shipToLocationId = shipToLocationId;
	}
	public String getShipToAddressName() {
		return shipToAddressName;
	}
	public void setShipToAddressName(String shipToAddressName) {
		this.shipToAddressName = shipToAddressName;
	}
	public String getShipToAddressLine1() {
		return shipToAddressLine1;
	}
	public void setShipToAddressLine1(String shipToAddressLine1) {
		this.shipToAddressLine1 = shipToAddressLine1;
	}
	public String getShipToAddressCity() {
		return shipToAddressCity;
	}
	public void setShipToAddressCity(String shipToAddressCity) {
		this.shipToAddressCity = shipToAddressCity;
	}
	public String getShipToAddressPostCode() {
		return shipToAddressPostCode;
	}
	public void setShipToAddressPostCode(String shipToAddressPostCode) {
		this.shipToAddressPostCode = shipToAddressPostCode;
	}
	public String getShipToAddressCountryCode() {
		return shipToAddressCountryCode;
	}
	public void setShipToAddressCountryCode(String shipToAddressCountryCode) {
		this.shipToAddressCountryCode = shipToAddressCountryCode;
	}
	public String getShipToDeliverAt() {
		return shipToDeliverAt;
	}
	public void setShipToDeliverAt(String shipToDeliverAt) {
		this.shipToDeliverAt = shipToDeliverAt;
	}
	public String getShipToDeliverLatestAt() {
		return shipToDeliverLatestAt;
	}
	public void setShipToDeliverLatestAt(String shipToDeliverLatestAt) {
		this.shipToDeliverLatestAt = shipToDeliverLatestAt;
	}


	public List<ItemsInfo> getItems() {
		return items;
	}


	public void setItems(List<ItemsInfo> items) {
		this.items = items;
	}


	/*public List<Items> getItems() {
		return items;
	}


	public void setItems(List<Items> items) {
		this.items = items;
	}*/
	
	
	
}
