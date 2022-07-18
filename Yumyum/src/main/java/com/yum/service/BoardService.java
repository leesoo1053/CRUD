package com.yum.service;

import java.util.List;

import com.yum.domain.BoardDTO;

public interface BoardService {
	
	public boolean registerBoard(BoardDTO params);

	public BoardDTO getBoardDetail(Integer num);

	public boolean deleteBoard(Integer num);

	public List<BoardDTO> getBoardList();
}
