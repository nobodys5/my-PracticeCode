package com.springboot.webyoungpil20240220.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.webyoungpil20240220.web.dto.TestRespDto;

@RestController // reponsbody와 controller 합쳐놓은것
@RequestMapping("/api/v1")//전체 설정해주는 어노테이션
public class ApiTestController {
	
	
	@GetMapping("/test")
	public String getTest() {
		return "test data";
	}
	/*
	 * api/v1/userTest 겟요청을 보냄
	 * 메소드명 getUserTest
	 * 리턴 gildong/1234인 객체 리턴
	 */
	
	@GetMapping("/userTest")
	public TestRespDto getUserTest() {
		//객체를 json형태로 보여줌
		//testrespdto에있는 빌더를 호출하여 리턴값호출
		return TestRespDto.builder()
				.username("김영필")
				.password("1234")
				.build();
	}
	//포스트맵핑용 메소드
//	@PostMapping("/userTest")
//	public TestRespDto getUserTest() {
//		//객체를 json형태로 보여줌
//		//testrespdto에있는 빌더를 호출하여 리턴값호출
//		return TestRespDto.builder()
//				.username("김영필")
//				.password("1234")
//				.build();
//	}
	@GetMapping("/userLogin")  
	//requestparam이 자동으로 자료형을 잡아줘서 포스트맨에서 ""없이 작성가능
	public String getUserLogin(@RequestParam("name") String name, @RequestParam("password") int password ) {
		return name + password;
	}
	
	
	/*
	 * @RequestParam -> 파람으로 값을 보낼때 매개변수에서 받는 용도
	 * @RequestParam("name")->  키값("name")을 잡아줘야함.
	 * String name에서 name에 벨류 값이 들어옴(자료형은 @RequestParam이 잡아줌)
	 * @RequestParam, 소괄호 안의 키값 생략 가능
	 */
	
	// 아래와 같이 requestparam과 키값 생략해도 실행이가능하다.
	//()안에 자료형이있으면 param이라고 생각하고 키값과 벨류값 작성해주면됨
//	@GetMapping("/userLogin")
//	public String getUserLogin(String name, int password) {
//		return name + password;
//	}
		
}
