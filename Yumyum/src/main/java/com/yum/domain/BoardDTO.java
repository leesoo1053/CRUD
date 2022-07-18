package com.yum.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {

	/** 번호 (PK) */
	private Integer num;

	/** 회원번호 (PK) */
	private int userNum;
	
	/** 제목 */
	private String title;

	/** 작성자 */
	private String writerId;

	/** 내용 */
	private String content;

	/** 조회 수 */
	private int hit;
	
	/** 작성 일 */
	private String wrDate;

	/** 공지 여부 */
	private String noticeYn;

	/** 커뮤니티 여부 */
	private String communityYn;

	/** 삭제 여부 */
	private String delYn;

	/** 이미지 */
	private long img;



}