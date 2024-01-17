package com.winter.app.board;

import java.sql.Date;

public class BoardDTO {
	
	private Long boardNum;
	private String boardName;
	private String boardUser;
	
	public Long getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(Long boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getBoardUser() {
		return boardUser;
	}
	public void setBoardUser(String boardUser) {
		this.boardUser = boardUser;
	}
	public String getBoardContents() {
		return boardContents;
	}
	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	public Long getBoardHits() {
		return boardHits;
	}
	public void setBoardHits(Long boardHits) {
		this.boardHits = boardHits;
	}
	private String boardContents;
	private Date boardDate;
	private Long boardHits;
	
		
	

}
