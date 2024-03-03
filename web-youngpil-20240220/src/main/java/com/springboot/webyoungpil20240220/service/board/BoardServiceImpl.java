package com.springboot.webyoungpil20240220.service.board;

import org.springframework.stereotype.Service;


import com.springboot.webyoungpil20240220.domain.board.Board;
import com.springboot.webyoungpil20240220.domain.board.BoardRepository;
import com.springboot.webyoungpil20240220.service.BoardService;
import com.springboot.webyoungpil20240220.web.dto.board.CreateBoardReqDto;
import com.springboot.webyoungpil20240220.web.dto.board.CreateBoardRespDto;
import com.springboot.webyoungpil20240220.web.dto.board.ReadPageBoardRespDto;
import com.springboot.webyoungpil20240220.web.dto.board.ReadBoardRespDto;

import lombok.RequiredArgsConstructor;

//component 개념 ioc bean 컨테이너에 생성시키기 위해 사용
//생성된 new 생성자를 싱글톤특성으로 공유시켜사용
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

	private final BoardRepository boardRepository;
	
	@Override
	public CreateBoardRespDto createBoard(CreateBoardReqDto boardReqDto) throws Exception {
		 
		//boardentity에 boardreqdto값을.toentity를 써서 entity 값으로 바꿔줌
		Board boardEntity = boardReqDto.toEntity();
//		System.out.println("DB가기전:" + boardEntity);
//		int result = boardRepository.save(boardEntity);
//		System.out.println("숫자 result:" + result);
//		System.out.println("DB 갔다온 후:" + boardEntity);
		
		boolean insertStatus = boardRepository.save(boardEntity) > 0;
//		System.out.println(boardEntity.toCreateBoardDto(insertStatus));
		return boardEntity.toCreateBoardDto(insertStatus);
	}

	@Override
	public ReadBoardRespDto readeBoard(int boardcode) throws Exception {
		return boardRepository.findBoardByBoardcode(boardcode).toReadBoardDto();
	}
	
	@Override
	public ReadPageBoardRespDto readepage(int pagecode) throws Exception {
		return boardRepository.page(pagecode).toReadPageDto();
	}

}
