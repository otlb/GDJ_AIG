package com.winter.app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.product.ProductDAO;
import com.winter.app.product.ProductDTO;

public class ProductTest extends Mytest {
	
	@Autowired
	private ProductDAO productDAO ;

	public void list() throws Exception{
		
		
		
	}
	
	@Test
		public void add()throws Exception{
			ProductDTO productDTO = new ProductDTO();
			
			for(int i=0;i<100;i++) {
				productDTO.setProductName("test"+i);
				productDTO.setProductContents("contents"+i);
				productDTO.setProductRate(i*0.01);
				productDTO.setProductJumsu(i*0.1);
			
			int result = productDAO.add(productDTO);
			if(i%10==0) {
				Thread.sleep(500);
			}
			
			}
			System.out.println("100개 입력 완료");
			//assertEquals(1, result);
		}

}
