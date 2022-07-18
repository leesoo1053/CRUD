package com.yum.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yum.domain.BoardDTO;
import com.yum.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public boolean registerBoard(BoardDTO params) {
		Integer queryResult = 0;

		if (params.getNum() == null) {
			queryResult = boardMapper.insertBoard(params);
		} else {
			queryResult = boardMapper.updateBoard(params);
		}

		return (queryResult == 1) ? true : false;
	}

	@Override
	public BoardDTO getBoardDetail(Integer num) {
		return boardMapper.selectBoardDetail(num);
	}

	@Override
	public boolean deleteBoard(Integer num) {
		Integer queryResult = 0;

		BoardDTO board = boardMapper.selectBoardDetail(num);

		if (board != null && "N".equals(board.getDelYn())) {
			queryResult = boardMapper.deleteBoard(num);
		}

		return (queryResult == 1) ? true : false;
	}

	@Override
	public List<BoardDTO> getBoardList() {
		List<BoardDTO> boardList = Collections.emptyList();

		Integer boardTotalCount = boardMapper.selectBoardTotalCount();

		if (boardTotalCount > 0) {
			boardList = boardMapper.selectBoardList();
		}

		return boardList;
	}


}
