package com.springboot.webyoungpil20240220.web.dto.board;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReadPageBoardRespDto {

	private int pagecode;
	private String title;
	private int usercode;
	private String username;
	private String content;
	private LocalDateTime createdate;
}
