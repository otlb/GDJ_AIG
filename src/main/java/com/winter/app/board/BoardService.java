package com.winter.app.board;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.Pager;

public interface BoardService {
	
	
	
	//목록 가지고오기
	public List<BoardDTO> getList(Pager pager) throws Exception;
	
	//detail
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception;
	
	//add
	public int setAdd(BoardDTO boardDTO,MultipartFile[] attchs) throws Exception;
	
	//update
	public int setUpdate(BoardDTO boardDTO,MultipartFile[] attchs) throws Exception;
	
	//delete
	public int setDelete(BoardDTO boardDTO) throws Exception;
	
}
