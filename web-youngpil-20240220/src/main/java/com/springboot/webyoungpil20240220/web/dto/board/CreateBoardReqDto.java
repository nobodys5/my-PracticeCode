package com.springboot.webyoungpil20240220.web.dto.board;

import com.springboot.webyoungpil20240220.domain.board.Board;

import lombok.Data;

@Data
public class CreateBoardReqDto {
	
	//showinfo 메소드 생성을위한 변수 선언
	private String title;
	private int usercode;
	private String content;
	
	/*
	 * 리턴 Board
	 * 메소드명: toEntity
	 * 위에있는 title,usercode,content를 board 객체 안에
	 * 넣어서 리턴
	 */
	public Board toEntity() {
		return Board.builder()
				.title(title)
				.usercode(usercode)
				.content(content)
				.build();
	}
	
	public void showInfo() {
		System.out.println(title);
		System.out.println(usercode);
		System.out.println(content);
		System.out.println("end");
	}
}
