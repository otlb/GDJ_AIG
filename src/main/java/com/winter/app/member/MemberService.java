package com.winter.app.member;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardFileDTO;
import com.winter.app.util.FileManager;

@Service
public class MemberService {
	@Autowired
	private MemberDAO memberDAO;
	@Autowired
	private ServletContext servletContext;
	@Autowired
	private FileManager fileManager;
	
	public int setJoin(MemberDTO memberDTO, MultipartFile photo)throws Exception{
		
		int result = memberDAO.setJoin(memberDTO);
		
		if(photo.isEmpty()) {
			return result;
		}
		
		String path = servletContext.getRealPath("/resources/upload/member");		
								
			String fileName = fileManager.fileSave(path, photo);
			AvatarDTO avatarDTO = new AvatarDTO();
			avatarDTO.setFileName(fileName);
			avatarDTO.setOriName(photo.getOriginalFilename());
			avatarDTO.setUserName(memberDTO.getUserName());
			
			result = memberDAO.setFileAdd(avatarDTO);
		
			
		
		return result;	
		
	}

	public MemberDTO getLogin(MemberDTO memberDTO)throws Exception{
		MemberDTO m = memberDAO.getDetail(memberDTO);
		
		if(m != null) {
			if(m.getPassword().equals(memberDTO.getPassword())) {
				return m;
			}else {
				m=null;
			}			
		}
		
		return m;		
	}
	
	public int setUpdate(MemberDTO memberDTO,MultipartFile photo)throws Exception{
		return memberDAO.setUpdate(memberDTO);
	}
	
	
}
