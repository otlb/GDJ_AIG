package com.winter.app.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.util.Pager;

@Service
public class ReplyService {
	@Autowired
	private ReplyDAO replyDAO;
	
	public int setDelete(ReplyDTO replyDTO)throws Exception{
		return replyDAO.setDelete(replyDTO);
	}
	
	public int setUpdate(ReplyDTO replyDTO)throws Exception{
		return replyDAO.setUpdate(replyDTO);
	}
	
	public int setReply(ReplyDTO replyDTO)throws Exception{
		return replyDAO.setReply(replyDTO);		
	}
	
	public List<ReplyDTO> getList(ReplyDTO replyDTO,Pager pager)throws Exception{
		pager.setPerPage(5L);
		pager.makeRow();
		
		pager.makeNum(replyDAO.getTotalCount(replyDTO));
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("pager", pager);
		map.put("replyDTO",replyDTO);
					
		List<ReplyDTO> ar = replyDAO.getList(map);
		
		return ar;
	}

}
