package com.springboot.webyoungpil20240220.web.controller.api.board;

import org.apache.catalina.connector.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.webyoungpil20240220.service.BoardService;
import com.springboot.webyoungpil20240220.web.dto.CMRespDto;
import com.springboot.webyoungpil20240220.web.dto.board.CreateBoardReqDto;
import com.springboot.webyoungpil20240220.web.dto.board.CreateBoardRespDto;
import com.springboot.webyoungpil20240220.web.dto.board.ReadPageBoardRespDto;
import com.springboot.webyoungpil20240220.web.dto.board.ReadBoardRespDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {

	// boardservice에 @service에 의존하여 객체생성된것을 사용함
	private final BoardService boardService;
	
	
//	@PostMapping("/nowContent")
//	public ResponseEntity<?> addBoardNow(String title, int usercode, String content) {
//		System.out.println("title:"+title);
//		System.out.println("usercode:"+1);
//		System.out.println("content:"+content);
//		return ResponseEntity.ok().body("test");
//	}
	
//	@PostMapping("/nowContent")
//	public ResponseEntity<?> addBoardNow(CreateBoardReqDto createBoardReqDto) {
//
//		createBoardReqDto.showInfo();
//		createBoardReqDto.setContent("content");
////		System.out.println("title:"+ title);
////		System.out.println("usercode:"+1);
////		System.out.println("content:"+content);
//		return ResponseEntity.ok().body("test");
//	}
	
//	@PostMapping("/content")
//	//postman에 www-form에서 키값과 벨류값 작성한뒤 요청
//	public ResponseEntity<?> addBoard(String title) {
//		System.out.println("게시글 작성완료");
//		System.out.println("title:" + title);
//															//httpstatus가 200으로 ok라는뜻
//		return new ResponseEntity<>(title + "게시글 작성성공",HttpStatus.OK);
//	}
	
//	@PostMapping("/nowContent") 
//	public ResponseEntity<?> addBoardNow(String title, String content, int usercode) {
//		System.out.println("title:"+title);
//		System.out.println("usercode:"+usercode);
//		System.out.println("content:"+content);
//		return ResponseEntity.ok().body("test");
//	}
	
	@PostMapping("/nowContent") 
	public ResponseEntity<?> addBoardNow(CreateBoardReqDto createBoardReqDto) {
		createBoardReqDto.showInfo();
//		System.out.println("title:"+title);
//		System.out.println("usercode:"+usercode);
//		System.out.println("content:"+content);
		return ResponseEntity.ok().body("test");
	}
	
//	@PostMapping
//	public ResponseEntity<?> addboard(@RequestBody CreateBoardReqDto createBoardReqDto) {
//		boolean data = false;
//		
//		try {
//			System.out.println(createBoardReqDto);
//			data = boardService.createBoard(createBoardReqDto);
//		} catch (Exception e) {
//			//예외처리 결과를 설명해준다
//			e.printStackTrace();
//			//엔티티에 서버와 내용을 예외처리해준다는 실행문
//			return ResponseEntity.internalServerError().body(data);
//		}
//		return ResponseEntity.ok().body(data);
//	}
	
	@PostMapping("/content")         //어노테이션 안달면 dto의값이 들어오지않는다.
	public ResponseEntity<?> addBoard(@RequestBody CreateBoardReqDto createBoardReqDto) {
		// json으로 받을때는 @RequestBody 붙여줘야함.
		CreateBoardRespDto createBoardRespDto = null;
	try {
		System.out.println(createBoardReqDto);
		boardService.createBoard(createBoardReqDto);
	} catch (Exception e) {
		return ResponseEntity.internalServerError().body(new CMRespDto<>(-1,"게시글 등록실패", createBoardRespDto));
	}
	//try에서 오류가나지않을경우에 엔티티가 responsedata값을 리턴한다는뜻
	return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 등록 성공",createBoardRespDto));
	}
	
	@GetMapping("/count/{boardcode}")
	public ResponseEntity<?> getBoard(@PathVariable int boardcode) throws Exception{
		// System.out.println("boardcode:" + boardcode);
		
		ReadBoardRespDto readBoardRespDto = null;
		
		try {
			readBoardRespDto = boardService.readeBoard(boardcode);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1, "게시글 조회 실패",null));
		}
		
		return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 조회 성공", null));
	}
			
	/*
	 * 페이징처리
	 *	/list 파람으로page
	 *	1개의 페이지에 1개의게시글만보이도록 하는 요청을 작성하시오
	 *
	 */
	
	@GetMapping("/list/{pagecode}")
	public ResponseEntity<?> pageSuccess(@PathVariable int pagecode) throws Exception {
		//System.out.println(pagecode);
		
		ReadPageBoardRespDto pageBoardRespDto = null;
		
		try {
			pageBoardRespDto = boardService.readepage(pagecode);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"조회 실패",null));
	}
		return ResponseEntity.ok().body(new CMRespDto<>(1,"조회 성공",null));
//	@PostMapping("/nowContent")
//	public ResponseEntity<?> addBoardNow(CreateBoardReqDto createBoardReqDto) {
//
//		// 불리언 변수 초기화
//		boolean responseData = false;
//		
//		try {//try에서 아래와같은 코드가 터지면
//		responseData = boardService.createBoard(createBoardReqDto);
//		} catch (Exception e) {
//			//catch이부분에서 예외처리를해준다.
//			e.printStackTrace();
//			return ResponseEntity.internalServerError().body(responseData);
//		}
//		
//		return ResponseEntity.ok().body(responseData);
//	}
	}
}
