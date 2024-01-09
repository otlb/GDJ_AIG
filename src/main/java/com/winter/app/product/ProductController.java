package com.winter.app.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	
//	@RequestMapping(value="detail", method = RequestMethod.GET)
//	public String detail(ProductDTO productDTO,Model model) throws Exception {
//		
//		productDTO = productService.detail(productDTO);
//		
//		model.addAttribute("dto", productDTO);
//		
//		return "product/detail";
//		
//	}
	@RequestMapping(value = "add",method = RequestMethod.GET)
	public String add() {		
		
		
		return "regions/add";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String add(ProductDTO productDTO,Model model) throws Exception{
		
		int result = productService.add(productDTO);
		String msg = "등록 실패";
		
		if(result>0) {
			msg = "등록 성공";
			
		}
		model.addAttribute("msg", msg);
		model.addAttribute("path","./list");
		return "product/add";
	}

}
