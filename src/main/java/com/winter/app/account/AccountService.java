package com.winter.app.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO;
	
	
	public int setJoin(AccountDTO accountDTO)throws Exception{
		  
		  Long num = System.currentTimeMillis();
		  accountDTO.setAccountNum(num);
		  
		 int result = accountDAO.setJoin(accountDTO);
		 return result;
	}
	
	

}
