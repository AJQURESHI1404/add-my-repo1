package com.zira.restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu {
	
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private long Productid;
 @Column(name="product_name")
 private String ProductName;
 @Column(name="quantity")
 private long Quantity;
 @Column(name="status")
 private String Status;
 @Column(name="price")
 private long Price; 
 
 
public long getProductid() {
	return Productid;
}
public void setProductid(long productid) {
	Productid = productid;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public long getQuantity() {
	return Quantity;
}
public void setQuantity(long quantity) {
	Quantity = quantity;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public long getPrice() {
	return Price;
}
public void setPrice(long price) {
	Price = price;
}


} 
 
	


