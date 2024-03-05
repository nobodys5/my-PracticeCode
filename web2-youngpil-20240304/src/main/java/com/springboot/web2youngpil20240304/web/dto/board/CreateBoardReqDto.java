package com.springboot.web2youngpil20240304.web.dto.board;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateBoardReqDto {

	private String usercode;
	private String username;
	private int password;
	private String name;
	private String email;
	private LocalDateTime createdate;
	private LocalDateTime updatedate;
}
