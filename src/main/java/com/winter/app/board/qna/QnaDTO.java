package com.winter.app.board.qna;

import java.util.List;

import com.winter.app.board.BoardDTO;

public class QnaDTO extends BoardDTO {

	private Long boardRef;
	private Long boardStep;
	private Long boardDepth;
	private List<BoardDTO> boardDTOs;
	
	
	public List<BoardDTO> getBoardDTOs() {
		return boardDTOs;
	}
	public void setBoardDTOs(List<BoardDTO> boardDTOs) {
		this.boardDTOs = boardDTOs;
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
