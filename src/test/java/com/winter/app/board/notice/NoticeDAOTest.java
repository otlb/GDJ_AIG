package com.winter.app.board.notice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.winter.app.Mytest;
import com.winter.app.board.BoardDAO;
import com.winter.app.board.BoardDTO;
import com.winter.app.util.Pager;

public class NoticeDAOTest extends Mytest {


	private NoticeDAO noticeDAO;
	
	
	@Test
	public void getListTest()throws Exception{
		Pager pager = new Pager();
		pager.makeRow();
		
		List<BoardDTO> ar = noticeDAO.getList(pager);
		assertNotEquals(0, ar.size()); 
	}

}
