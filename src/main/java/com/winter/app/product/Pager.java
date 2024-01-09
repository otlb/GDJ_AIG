package com.winter.app.product;


public class Pager {

	private Long startRow;
	private Long lastRow;
	private Long perPage = 10L;//몇개씩 조회
	private Long page;
	private Long totalPage;
	private Long startNum;
	private Long lastNum;	
	private boolean start;
	private boolean last;
	
	//startRow,lastRow 계산하는 메서드
	public void makeRow() {
		this.startRow=(this.getPage()-1)*this.getPerPage()+1;
		this.lastRow= this.getPage()*this.getPerPage();				
		
	}
	public void makeNum(Long totalCount) {
		//1.총 갯수로 총 페이지 수 구하기		
		Long totalPage = 0L;
		totalPage = totalCount/this.getPerPage();
		if(totalCount%this.getPerPage()!=0) {
			totalPage++;
		}		
		this.setTotalPage(totalPage);
		
		//2.총페이지수로 총 블럭수 구하기
		Long perBlock = 5L;
		Long totalBlock = 0L;
		totalBlock = totalPage/perBlock;
		if(totalPage%perBlock !=0) {
			totalBlock++;
		}		
		//3.현재페이지 번호로 현재블럭번호구하기
		Long curBlock=0L;
		
		curBlock = this.getPage()/perBlock;
		if(this.getPage()%perBlock != 0) {
			curBlock++;
		}		
		//4.현재블럭번호로 시작번호와 끝번호구하기
		Long startNum = 0L;
		Long lastNum = curBlock*perBlock;
		startNum = lastNum-perBlock+1;
		
		this.setLastNum(lastNum);
		this.setStartNum(startNum);		
		
		//5.이전,다음 블럭 유무 구하기 
		
		if(curBlock==1) {
			this.setStart(true);
		}
		if(curBlock==totalBlock) {
			this.setLast(last);
			this.setLastNum(totalPage);
		}
		
		
	}
	
	public Long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getStartNum() {
		return startNum;
	}
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}
	public Long getLastNum() {
		return lastNum;
	}
	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}
	public boolean isStart() {
		return start;
	}
	public void setStart(boolean start) {
		this.start = start;
	}
	public boolean isLast() {
		return last;
	}
	public void setLast(boolean last) {
		this.last = last;
	}
	
	
	
	public Long getPerPage() {
		
		return perPage;
	}
	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	
	public Long getPage() {
		if(this.page == null || this.page < 1) {
			this.page =1L;
		}
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	
}
