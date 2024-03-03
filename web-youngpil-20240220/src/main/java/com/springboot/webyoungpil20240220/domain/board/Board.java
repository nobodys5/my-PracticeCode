package com.springboot.webyoungpil20240220.domain.board;

import java.time.LocalDateTime;

import com.springboot.webyoungpil20240220.web.dto.board.CreateBoardRespDto;
import com.springboot.webyoungpil20240220.web.dto.board.ReadBoardRespDto;
import com.springboot.webyoungpil20240220.web.dto.board.ReadPageBoardRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Board {//entity

	private int boardcode;
	private String title;
	private int usercode;
	
	private String username;
	
	private String content;
	private LocalDateTime createdate;
	private LocalDateTime updatedate;
	
	public CreateBoardRespDto toCreateBoardDto(boolean insertStatus) {
		
		return CreateBoardRespDto.builder()
				.boardcode(boardcode)
				.title(title)
				.usercode(usercode)
				.content(content)
				.insertStatus(insertStatus)
				.build();
		
	}
	
	//entity에서 dto로 값을 변환하는용도에 메소드 db에서 값을받아왔기때문에 변환해줌
	public ReadBoardRespDto toReadBoardDto() {
		return ReadBoardRespDto.builder()
				.boardcode(boardcode)
				.title(title)
				.usercode(usercode)
				.username(username)
				.content(content)
				.createdate(createdate)
				.build();
				
	}
	
	public ReadPageBoardRespDto toReadPageDto() {
		return ReadPageBoardRespDto.builder()
				.pagecode(boardcode)
				.title(title)
				.usercode(usercode)
				.username(username)
				.content(content)
				.createdate(createdate)
				.build();
	}
}
