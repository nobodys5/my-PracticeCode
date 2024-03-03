package com.springboot.webyoungpil20240220.web.controller.api.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/di")
public class DiController {

	//인터페이스 2개를구현하고있기때문에 구현을위한 변수초기화
	// 인터페이스의 적어놓은 t1,t2를 적어줄어노테이션 생성
	@Autowired
	@Qualifier("t1")
	private TestInterface testInterface;
	
	@Autowired
	@Qualifier("t2")
	private TestInterface testInterface2;
	
	@GetMapping("/test1")
	public ResponseEntity<?> test1() {
		//테스트인터페이스1에있는 a,b가 호출됨
		testInterface.a();
		testInterface.b();

		//테스트인터페이스2에있는 a,b가 호출됨
		testInterface2.a();
		testInterface2.b();
		return ResponseEntity.ok().body(null);
	}
	
	//testinterfaceimple을 2개생성했는데 하나만호출하여서 오류가발생된다.
//	@GetMapping("/test1")
//	public ResponseEntity<?> test1() {
//		testInterface.a();
//		return ResponseEntity.ok().body(null);
//	}
}
