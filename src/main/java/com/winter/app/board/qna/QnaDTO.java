package com.winter.app.board.qna;

import java.util.List;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardFileDTO;

public class QnaDTO extends BoardDTO {

	private Long boardRef;
	private Long boardStep;
	private Long boardDepth;
	private List<BoardFileDTO> boardFileDTOs;
	
	

	
	public List<BoardFileDTO> getBoardFileDTOs() {
		return boardFileDTOs;
	}
	public void setBoardFileDTOs(List<BoardFileDTO> boardFileDTOs) {
		this.boardFileDTOs = boardFileDTOs;
	}
	public Long getBoardRef() {
		return boardRef;
	}
	public void setBoardRef(Long boardRef) {
		this.boardRef = boardRef;
	}
	public Long getBoardStep() {
		return boardStep;
	}
	public void setBoardStep(Long boardStep) {
		this.boardStep = boardStep;
	}
	public Long getBoardDepth() {
		return boardDepth;
	}
	public void setBoardDepth(Long boardDepth) {
		this.boardDepth = boardDepth;
	}
}
