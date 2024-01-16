package com.winter.app.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.board.BoardDAO;
import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardFileDTO;
import com.winter.app.util.Pager;

@Repository("qna")
public class QnaDAO implements BoardDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.winter.app.board.qna.QnaDAO.";
	
	
	@Override
	public Long getTotalCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		return sqlSession.selectList(NAMESPACE+"getList", pager);		
		
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getDetail", boardDTO);
		
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setAdd", boardDTO);		 
	}
	
	public int setFileAdd(BoardFileDTO boardFileDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setFileAdd", boardFileDTO);
	}
	
	public List<BoardFileDTO> getFileList(BoardDTO boardDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"getFileList", boardDTO);
	}
	
	public int setFileDelete(BoardDTO boardDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"setFileDelete", boardDTO);
	}
	
	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		
		return 0;
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.update(NAMESPACE+"setDelete", boardDTO);
	}
	
	public int setReplyUpdate(QnaDTO qnaDTO)throws Exception{
		
		return sqlSession.update(NAMESPACE+"setReplyUpdate", qnaDTO);
	}
	
	public int setReplyAdd(QnaDTO qnaDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setReplyAdd", qnaDTO);
	}
	

}
