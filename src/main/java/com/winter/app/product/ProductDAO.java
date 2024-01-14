package com.winter.app.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.util.Pager;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private String namespace = "com.winter.app.product.ProductDAO.";
	
	public List<ProductDTO> list(Pager pager) throws Exception{
		return sqlSession.selectList(namespace+"list",pager );
	}
	
	public Long getTotal(Pager pager)throws Exception{
		return sqlSession.selectOne(namespace+"getTotal", pager);
	}
	
	public List<ProductFileDTO> getListFiles(ProductDTO productDTO)throws Exception{
		
		return sqlSession.selectList(namespace+"getListFiles", productDTO);
	}
	
	public ProductDTO detail(ProductDTO productDTO)throws Exception{
		return sqlSession.selectOne(namespace+"detail", productDTO);
	}
	
	public int add(ProductDTO productDTO)throws Exception{
		return sqlSession.insert(namespace+"add", productDTO);
	}
	
	public int addFile(ProductFileDTO productFileDTO)throws Exception{
		return sqlSession.insert(namespace+"addFile", productFileDTO);
	}
	
	public int update(ProductDTO productDTO)throws Exception{
		return sqlSession.update(namespace+"update", productDTO);
	}
	public int delete(ProductDTO productDTO)throws Exception{
		return sqlSession.delete(namespace+"delete", productDTO);
	}
}
