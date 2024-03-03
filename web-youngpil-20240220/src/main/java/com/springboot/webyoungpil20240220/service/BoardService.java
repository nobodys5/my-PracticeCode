package com.springboot.webyoungpil20240220.service;

import com.springboot.webyoungpil20240220.web.dto.board.CreateBoardReqDto;
import com.springboot.webyoungpil20240220.web.dto.board.CreateBoardRespDto;
import com.springboot.webyoungpil20240220.web.dto.board.ReadPageBoardRespDto;
import com.springboot.webyoungpil20240220.web.dto.board.ReadBoardRespDto;

public interface BoardService {

	public CreateBoardRespDto createBoard(CreateBoardReqDto boardReqDto) throws Exception;

	public ReadBoardRespDto readeBoard(int boardcode) throws Exception;
	
	public ReadPageBoardRespDto readepage(int pagecode) throws Exception;
}
