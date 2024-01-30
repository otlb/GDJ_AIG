package com.winter.app.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.winter.app.member.MemberDTO;
import com.winter.app.util.Pager;

@RestController// 모든 매서드가 json으로 넘겨줄때 사용
@RequestMapping("/reply/*")
public class ReplyController {
	
	@Autowired
	private ReplyService replyService;
	
	@PostMapping("add")
	@ResponseBody
	public Map<String, Object> setReply(Pager pager,ReplyDTO replyDTO,HttpSession session,Model model)throws Exception{
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		replyDTO.setUserName(memberDTO.getUserName());
		
		int result = replyService.setReply(replyDTO);
		
		List<ReplyDTO> ar = replyService.getList(replyDTO,pager);
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("datas", ar);
		map.put("pager",pager);
		
		return map;
		
	}
	
	@GetMapping("list")
	@ResponseBody
	public Map<String,Object> getList(ReplyDTO replyDTO,Model model,Pager pager)throws Exception{
		List<ReplyDTO> ar= replyService.getList(replyDTO,pager);
		//model.addAttribute("list",ar);
		//model.addAttribute("pager",pager);
		
		//[{"userName":"??","contents":"???","date":"???"}] 
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("datas", ar);
		map.put("pager",pager);
		
		return map;
	}
	
	@PostMapping("update")
	@ResponseBody
	public int setUpdate(ReplyDTO replyDTO)throws Exception{
		int result = replyService.setUpdate(replyDTO);
		
		return result;
	}
	
	@PostMapping("delete")
	@ResponseBody
	public Map<String, Object> setDelete(Pager pager, ReplyDTO replyDTO)throws Exception{
		replyService.setDelete(replyDTO);
	 	List<ReplyDTO> ar = replyService.getList(replyDTO, pager);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("datas", ar);
		map.put("pager", pager);
		
		return map;
	}
	
	
	
}
