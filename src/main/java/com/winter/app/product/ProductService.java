package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductDAO productDAO;
	
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
	
	public int add(ProductDTO productDTO) throws Exception{
		
			return productDAO.add(productDTO);
	}
}
