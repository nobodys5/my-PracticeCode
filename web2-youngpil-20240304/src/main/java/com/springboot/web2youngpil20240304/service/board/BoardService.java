package com.springboot.web2youngpil20240304.service.board;

import com.springboot.web2youngpil20240304.web.dto.board.CreateBoardReqDto;
import com.springboot.web2youngpil20240304.web.dto.board.CreateBoardRespDto;

public interface BoardService {

	public CreateBoardRespDto createBoard(CreateBoardReqDto boardReqDto);
}
