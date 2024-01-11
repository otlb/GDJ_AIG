package com.winter.app.product;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;



@Service
public class ProductService {

	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private ServletContext servletContext;
	
	public List<ProductDTO> getList(Pager pager) throws Exception{
		pager.makeRow();
		Long totalCount = productDAO.getTotal(pager);
		
		pager.makeNum(totalCount);
		
		List<ProductDTO> ar = this.productDAO.list(pager);
		
		return ar;
	}
	
	public ProductDTO detail(ProductDTO productDTO) throws Exception{
		
			return productDAO.detail(productDTO);			
			
	}
	
	
	
	
	
	public int add(ProductDTO productDTO,MultipartFile  file) throws Exception{
		
		int result = productDAO.add(productDTO);
		
		//어디에 저장할것인가 ?
		String path = servletContext.getRealPath("/resources/upload");
		System.out.println(path);
		File f = new File(path, "product");
		if(!f.exists()) {
			f.mkdirs();
		}
		
		
		//파일명 정하기 
		String fileName = UUID.randomUUID().toString()+"_"+file.getOriginalFilename();
				
		//파일저장
		f =new File(f,fileName);
		FileCopyUtils.copy(file.getBytes(), f);
		
		//db에 저장
		ProductFileDTO dto = new ProductFileDTO();
		dto.setFileName(fileName);
		dto.setOriName(file.getOriginalFilename());
		dto.setProductNum(productDTO.getProductNum());
		productDAO.addFile(dto);
		
		
		return result;
	}
	
	
	
	
	
	
	public int update(ProductDTO productDTO) throws Exception{
		return productDAO.update(productDTO);
	}
	
	//delete
	public int delete(ProductDTO productDTO) throws Exception{
		
		return productDAO.delete(productDTO);
		
	}
	
	
	
}
