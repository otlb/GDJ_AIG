package com.winter.app.account;

import java.sql.Date;

import com.winter.app.product.ProductDTO;

public class AccountDTO extends ProductDTO {

	private Long accountNum;
	private String userName;
	//private Long productNum;
	private Long accountPw;
	private Date accountDate;
	private Long accountBlanace;
	
	public Long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
//	public Long getProductNum() {
//		return productNum;
//	}
//	public void setProductNum(Long productNum) {
//		this.productNum = productNum;
//	}
	public Long getAccountPw() {
		return accountPw;
	}
	public void setAccountPw(Long accountPw) {
		this.accountPw = accountPw;
	}
	public Date getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(Date accountDate) {
		this.accountDate = accountDate;
	}
	public Long getAccountBlanace() {
		return accountBlanace;
	}
	public void setAccountBlanace(Long accountBlanace) {
		this.accountBlanace = accountBlanace;
	}
}
