package com.winter.app.product;

import java.sql.Date;

public class ReplyDTO {
	
	private Long replyNum;
	private Long productNum;
	private String userName;
	private Date replyDate;
	private Long replyJumsu;
	private String replyContents;
	
	
	public String getReplyContents() {
		return replyContents;
	}
	public void setReplyContents(String replyContents) {
		this.replyContents = replyContents;
	}
	public Long getProductNum() {
		return productNum;
	}
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}
	public Long getReplyNum() {
		return replyNum;
	}
	public void setReplyNum(Long replyNum) {
		this.replyNum = replyNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userNmae) {
		this.userName = userNmae;
	}
	public Date getReplyDate() {
		return replyDate;
	}
	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}
	public Long getReplyJumsu() {
		return replyJumsu;
	}
	public void setReplyJumsu(Long replyJumsu) {
		this.replyJumsu = replyJumsu;
	}

}
