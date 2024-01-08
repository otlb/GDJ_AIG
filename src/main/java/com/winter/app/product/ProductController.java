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
	public String list(HttpServletRequest request) throws Exception {
		
		List<ProductDTO> ar = productService.getList();
		request.setAttribute("list",ar);
		
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

}
