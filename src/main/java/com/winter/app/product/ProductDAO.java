package com.winter.app.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private String namespace = "com.winter.app.product.ProductDAO.";
	
	public Long getTotal(Pager pager) throws Exception {
		return sqlSession.selectOne(namespace+"getTotal",pager);
		
	}
		
	
	//목록
	public List<ProductDTO> list(Pager pager) throws Exception {
							
			return sqlSession.selectList(namespace+"list",pager);
			
	}
	//디테일
	public ProductDTO detail(ProductDTO productDTO) throws Exception{
		
				return sqlSession.selectOne(namespace+"detail", productDTO);
	}
	
	
	
	//등록
	public int add(ProductDTO productDTO) {		
			
		return sqlSession.insert(namespace+"add", productDTO);
	}
	public int addFile(ProductFileDTO productFileDTO) throws Exception{
		return sqlSession.insert(namespace+"addFile", productFileDTO);
	}
	
	
	//수정(UPDATE)	
	public int update(ProductDTO productDTO) throws Exception  {
		
		return sqlSession.update(namespace+"update",productDTO);
	}
	
	//삭제(delete)
	public int delete(ProductDTO productDTO) throws Exception{
		return sqlSession.delete(namespace+"delete", productDTO);	
	}

}

