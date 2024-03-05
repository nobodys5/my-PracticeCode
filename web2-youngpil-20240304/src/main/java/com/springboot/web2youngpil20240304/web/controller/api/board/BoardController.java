package com.springboot.web2youngpil20240304.web.controller.api.board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web2youngpil20240304.service.board.BoardService;
import com.springboot.web2youngpil20240304.web.dto.board.CreateBoardReqDto;
import com.springboot.web2youngpil20240304.web.dto.board.CreateBoardRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/todolist")
public class BoardController {
	private final BoardService boardservice;

	@GetMapping("/list")
	public ResponseEntity<?> todolist(CreateBoardReqDto createBoardReqDto) {
		boolean data;
		
//		System.out.println(createBoardReqDto);
		
		boardservice.createBoard(createBoardReqDto);
		return ResponseEntity.ok().body(createBoardReqDto);
	}
	

	
	
}
