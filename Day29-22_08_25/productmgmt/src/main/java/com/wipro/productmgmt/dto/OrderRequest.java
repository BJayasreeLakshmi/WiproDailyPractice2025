package com.wipro.productmgmt.dto;

import lombok.Data;

@Data
public class OrderRequest {
	 	private int productId;
	    private int qtyPurchased;

	    public int getProductId() { return productId; }
	    public void setProductId(int productId) { this.productId = productId; }

	    public int getQtyPurchased() { return qtyPurchased; }
	    public void setQtyPurchased(int qtyPurchased) { this.qtyPurchased = qtyPurchased; }
}
