package com.infosys.fa4project.Order.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="productsordered")
public class ProductsOrdered {
	
	@EmbeddedId
	ProductsOrderedPk productsOrderedPk;
	@Column(name = "SELLERID", nullable = false)
	Integer sellerId;
	@Column(name = "QUANTITY", nullable = false)
	Integer quantity;
	
	public ProductsOrderedPk getProductsOrderedPk() {
		return productsOrderedPk;
	}
	public void setProductsOrderedPk(ProductsOrderedPk productsOrderedPk) {
		this.productsOrderedPk = productsOrderedPk;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
