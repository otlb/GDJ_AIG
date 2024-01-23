package com.winter.app.account;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.winter.app.account.AccountDAO.";
	
	
	public int setJoin(AccountDTO accountDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setJoin", accountDTO);	
	}
	
}
