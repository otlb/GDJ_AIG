package com.winter.app.account;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.util.Pager;

@Repository
public class AccountDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.winter.app.account.AccountDAO.";
	
	
	public int setJoin(AccountDTO accountDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setJoin", accountDTO);	
	}
	
	public List<AccountDTO> getList(Pager pager)throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}
	
	public Long getTotalCount(Pager pager)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getTotalCount", pager);
	}
	
	public int setWish(AccountDTO accountDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setWish", accountDTO);
	}
	
}
