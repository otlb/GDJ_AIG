package com.winter.app.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.winter.app.member.MemberDAO.";
	
	public int setJoin(MemberDTO memberDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setJoin", memberDTO);
	}
	
	public int setFileAdd(AvatarDTO avatarDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setFileAdd", avatarDTO);
	}
	
	public MemberDTO getDetail(MemberDTO memberDTO)throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"getDetail", memberDTO);
	}

}
