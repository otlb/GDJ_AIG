package com.winter.app.account;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.member.MemberDTO;
import com.winter.app.product.ProductDTO;
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
	
	public List<ProductDTO> getWishList(MemberDTO memberDTO)throws Exception{		
		return accountDAO.getWishList(memberDTO);
	}
	
	public int setWishDelet(Long[] productNum,MemberDTO memberDTO) throws Exception{
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("nums", productNum);
		map.put("member",memberDTO);
		return accountDAO.setWishDelet(map);
		
//		for(int i=0; i<productNum.length;i++) {
//			accountDTO = new AccountDTO();
//			accountDTO.setProductNum(productNum[i]);
//			accountDTO.setUserName(memberDTO.getUserName());
//   		accountDAO.setWishDelet(accountDTO);
//		}
//	
//		 
	}
	
}
