package com.winter.app.product;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.FileManager;
import com.winter.app.util.Pager;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private ServletContext servletContext;
	@Autowired
	private FileManager fileManager;
	
		
	public List<ProductDTO> getList(Pager pager)throws Exception{
			pager.makeRow();
			Long totalCount = productDAO.getTotal(pager);
			pager.makeNum(totalCount);
			
			List<ProductDTO> ar = this.productDAO.list(pager);
			return ar;
	}
	
	public ProductDTO getdetail(ProductDTO productDTO)throws Exception{
		return productDAO.detail(productDTO);
		
	}
	
	public int add(ProductDTO productDTO,MultipartFile[] file)throws Exception{
		int result = productDAO.add(productDTO);
		
		String path = servletContext.getRealPath("/resources/upload/product");
		System.out.println(path);
		
		for(MultipartFile f:file) {
			
			if(f.isEmpty()) {
				continue;
			}
		
		String fileName = fileManager.fileSave(path,f);		
				
		
		//db에 저장
		ProductFileDTO dto = new ProductFileDTO();
		dto.setFileName(fileName);
		dto.setOriName(f.getOriginalFilename());
		dto.setProductNum(productDTO.getProductNum());
		productDAO.addFile(dto);
		
		}
		return result;		
		
	}
	public int update(ProductDTO productDTO,MultipartFile[] attachs) throws Exception{
		return productDAO.update(productDTO);
	}
	
	public int delete(ProductDTO productDTO) throws Exception{
		//조회
		List<ProductFileDTO> ar = productDAO.getListFiles(productDTO);
		//db삭제
		int result = productDAO.delete(productDTO);
		//hdd삭제 
		String path = servletContext.getRealPath("/resources/upload/product/");
		
		for(ProductFileDTO f:ar) {
			fileManager.fileDelete(path, f.getFileName());			
		}		
		
		return result;
		
	}
	

}
