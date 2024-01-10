package com.winter.app.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="list", method = RequestMethod.GET)
	public String list(Model model,Pager pager) throws Exception {
		
		List<ProductDTO> ar = productService.getList(pager);
		model.addAttribute("list",ar);
		model.addAttribute("pager",pager);
		
		return "product/list";
	}
	
	
	@RequestMapping(value="detail", method = RequestMethod.GET)
	public String detail(ProductDTO productDTO,Model model) throws Exception {
		
		productDTO = productService.detail(productDTO);
		
		model.addAttribute("dto", productDTO);
		
		return "product/detail";
		
	}
	
	@RequestMapping(value = "add",method = RequestMethod.GET)
	public String add() {			
		
		return "product/add";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String add(ProductDTO productDTO,Model model,MultipartFile photo) throws Exception{
		
		int result = productService.add(productDTO,photo);
		String msg = "등록 실패";
		
		if(result>0) {
			msg = "등록 성공";
			
		}
		model.addAttribute("msg", msg);
		model.addAttribute("path","./list");
		return "commons/result";
	}
	
	@RequestMapping(value = "update",method = RequestMethod.GET)
	public void update(ProductDTO productDTO,Model model) throws Exception{
		
		productDTO = productService.detail(productDTO);
		model.addAttribute("dto",productDTO);
		
		
	}
	
	@RequestMapping(value = "update",method = RequestMethod.POST)
	public ModelAndView update(ProductDTO productDTO,ModelAndView modelAndView) throws Exception{
		
		int result = productService.update(productDTO);
		
		String msg = "수정 실패";
		if(result>0) {
			msg = "수정 성공";
		}
		modelAndView.addObject("msg",msg);
		modelAndView.addObject("path", "./list");
		
		modelAndView.setViewName("commons/result");
		
		return modelAndView;		
		
	}
	
	@RequestMapping(value = "delete",method = RequestMethod.POST)
	public String delete(ProductDTO productDTO,Model model) throws Exception{
		
		int result = productService.delete(productDTO);
		
		String msg = "삭제 실패";
		if(result>0) {
			msg = "삭제 성공";
		}
		model.addAttribute("msg",msg);
		model.addAttribute("path", "./list");
				
		
		return "commons/result";
	}
	
	
	

}
