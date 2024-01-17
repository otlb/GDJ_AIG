package com.winter.app.board.notice;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardDAO;
import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardFileDTO;
import com.winter.app.board.BoardService;
import com.winter.app.product.ProductFileDTO;
import com.winter.app.util.FileManager;
import com.winter.app.util.Pager;

@Service
public class NoticeService implements BoardService {
	
	@Autowired
	@Qualifier("na")
	private NoticeDAO boardDAO;
	
	@Autowired
	private FileManager fileManager;
	
	@Autowired
	private ServletContext servletContext;
	
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		pager.makeRow();
		Long totalCount = boardDAO.getTotalCount(pager);
		pager.makeNum(totalCount);
		List<BoardDTO> ar = boardDAO.getList(pager);				
		return ar;
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		
		return boardDAO.getDetail(boardDTO);
		
	}

	@Override
	public int setAdd(BoardDTO boardDTO,MultipartFile[] attachs) throws Exception {
		//1. 글을 등록 - 글번호를 알기위해서
		int result = boardDAO.setAdd(boardDTO);
		
		//2.파일을 hdd에 저장하는 작업 
		//2-1 저장할 폴더의 실제 경로 구하기
		String path = servletContext.getRealPath("/resources/upload/notice");
		
		for(MultipartFile f:attachs) {
			
			if(f.isEmpty()) {
				continue;
			}
			
			String fileName = fileManager.fileSave(path, f);
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriName(f.getOriginalFilename());
			boardFileDTO.setBoardNum(boardDTO.getBoardNum());
			result = boardDAO.setFileAdd(boardFileDTO);
		}
		return result;
		 
	}

	@Override
	public int setUpdate(BoardDTO boardDTO, MultipartFile[] attachs) throws Exception {
		//hdd에 파일 저장해야함  나중에 할것
		return boardDAO.setUpdate(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		//조회
		List<BoardFileDTO> ar = boardDAO.getFileList(boardDTO);
		//db삭제
		int result = boardDAO.setDelete(boardDTO);
		//hdd삭제 
		String path = servletContext.getRealPath("/resources/upload/notice/");
		
		for(BoardFileDTO f:ar) {
			fileManager.fileDelete(path, f.getFileName());			
		}		
		
		return result;
	}

}
