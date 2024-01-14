package com.winter.app.product;

import java.util.List;

public class ProductDTO {
	
	private Long productNum;
	private String productName;
	private String productContents;
	private double productRate;
	private double productJumsu;
	private List<ProductFileDTO> productFileDTOs;
	private Long productCount;
	private Integer productSale;
	
	
	
	public Long getProductCount() {
		return productCount;
	}
	public void setProductCount(Long productCount) {
		this.productCount = productCount;
	}
	public Integer getProductSale() {
		return productSale;
	}
	public void setProductSale(Integer productSale) {
		this.productSale = productSale;
	}
	public Long getProductNum() {
		return productNum;
	}
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductContents() {
		return productContents;
	}
	public void setProductContents(String productContents) {
		this.productContents = productContents;
	}
	public double getProductRate() {
		return productRate;
	}
	public void setProductRate(double productRate) {
		this.productRate = productRate;
	}
	public double getProductJumsu() {
		return productJumsu;
	}
	public void setProductJumsu(double productJumsu) {
		this.productJumsu = productJumsu;
	}
	public List<ProductFileDTO> getProductFileDTOs() {
		return productFileDTOs;
	}
	public void setProductFileDTOs(List<ProductFileDTO> productFileDTOs) {
		this.productFileDTOs = productFileDTOs;
	} 

}
