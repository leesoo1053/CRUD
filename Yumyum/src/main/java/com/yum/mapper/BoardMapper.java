package com.yum.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yum.domain.BoardDTO;

@Mapper
public interface BoardMapper {

	public int insertBoard(BoardDTO params);

	public BoardDTO selectBoardDetail(Integer Num);

	public int updateBoard(BoardDTO params);

	public int deleteBoard(Integer num);

	public List<BoardDTO> selectBoardList();

	public int selectBoardTotalCount();

}
