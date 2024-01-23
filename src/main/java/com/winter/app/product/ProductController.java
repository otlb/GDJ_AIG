package com.winter.app.product;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardDTO;
import com.winter.app.util.Pager;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value ="list",method = RequestMethod.GET)
	public String getList(Model model,Pager pager)throws Exception{
		
			List<ProductDTO> ar = productService.getList(pager);
			model.addAttribute("list",ar);
			model.addAttribute("pager",pager);
					
			return "product/list";	
	}
	
	@RequestMapping(value = "detail",method = RequestMethod.GET)
	public String getDetail(ProductDTO productDTO,Model model)throws Exception{
			productDTO = productService.getdetail(productDTO);
			model.addAttribute("dto",productDTO);
			return "product/detail";
	}
	
	
	
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add()throws Exception {
				
	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String add(Model model,ProductDTO productDTO,MultipartFile [] photo)throws Exception{
		int result = productService.add(productDTO,photo);
		String msg = "등록 실패";
		
		if(result>0) {
			msg = "등록 성공";
			
		}
		model.addAttribute("msg", msg);
		model.addAttribute("path","./list");
		return "commons/result";
				
	}
	
	@GetMapping("update")
	public String update(ProductDTO productDTO,Model model)throws Exception{
		productDTO = productService.getdetail(productDTO);
		model.addAttribute("dto", productDTO);
		return "product/update";
	}
	
	
	@RequestMapping(value = "update",method = RequestMethod.POST)
	public String update(ProductDTO productDTO,MultipartFile[] attachs) throws Exception{
		
		int resutl = productService.update(productDTO,attachs);
		
		return "redirect:./list";			
		
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
