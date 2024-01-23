package com.winter.app.account;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.member.MemberDTO;
import com.winter.app.product.ProductDTO;
import com.winter.app.util.Pager;

@Controller
@RequestMapping("/account/*")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping("list")
	public String getList(Pager pager,Model model,HttpSession session)throws Exception{
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		pager.setUserName(memberDTO.getUserName());
		List<AccountDTO> ar = accountService.getList(pager);
		model.addAttribute("list", ar);
		model.addAttribute("pager", pager);
		return "account/list";
	}
		
	
	@GetMapping("join")
	public String setJoin(ProductDTO productDTO,Model model)throws Exception{

		model.addAttribute("dto", productDTO);		
		return "account/join";
	}
	@PostMapping("join")
	public String setJoin(HttpSession session,AccountDTO accountDTO,Model model)throws Exception{
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");	
		
				  accountDTO.setUserName(memberDTO.getUserName());
		
		
		int result = accountService.setJoin(accountDTO);
		String msg = "등록 실패";
		
		if(result>0) {
			msg = "등록 성공";
			
		}
		model.addAttribute("msg", msg);
		model.addAttribute("path","./list");
		return "commons/result";		
	}

}
