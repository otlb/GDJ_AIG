package com.winter.app.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("join")
	public String setJoin()throws Exception{
		
		return "member/join";
	}
	@PostMapping("join")
	public String setJoin(MemberDTO memberDTO, MultipartFile photo,Model model)throws Exception{
		int result = memberService.setJoin(memberDTO, photo);
		
		String msg = "회원가입을 실패하셨습니다.";
		if(result>0) {
			msg = "회원가입이 되었습니다.";
		}
		model.addAttribute("msg",msg);
		model.addAttribute("path", "../");
				
		
		return "commons/result";
		//return "redirect:../";		
	}
	@GetMapping("login")
	public void getLongin()throws Exception{
		
	}
	
	@PostMapping("login")
	public String getLongin(MemberDTO memberDTO, HttpSession session,Model model)throws Exception{
		memberDTO = memberService.getLogin(memberDTO);
		
		if(memberDTO == null) {
			model.addAttribute("msg","ID 또는 PW확인");
			return "member/login";
		}
		
		session.setAttribute("member", memberDTO);
		return "redirect:../"; 
			
	}
	@GetMapping("logout")
	public String getLogout(HttpSession session)throws Exception{
		//session.setAttribute("member", null);
		//session.removeAttribute("member");
		session.invalidate(); // 세션이 살아있는 시간을 0으로 만듬
		return "redirect:../";
	}
	
	@GetMapping("mypage")
	public String getMyPage(HttpSession session)throws Exception{
		
		
		return "member/mypage";
	}
	
}