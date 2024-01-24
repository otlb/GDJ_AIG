package com.winter.app.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.util.Pager;

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
	
	public List<AccountDTO> getList(Pager pager)throws Exception{
		pager.makeRow();
		Long totalCount = accountDAO.getTotalCount(pager);
		pager.makeNum(totalCount);
		List<AccountDTO> ar = accountDAO.getList(pager);
		return ar;
	}
	
	public int setWish(AccountDTO accountDTO)throws Exception{
		 int result = accountDAO.setWish(accountDTO);
		 return result; 
	}
	

}
