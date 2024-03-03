package com.springboot.webyoungpil20240220.domain.board;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {

	public int save(Board board);
	
	public Board findBoardByBoardcode(int boardcode);
	
	public Board page(int pagecode);
}
