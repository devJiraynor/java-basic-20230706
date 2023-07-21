package com.seojihoon.board.entity;

// 댓글 작성자의 프로필 사진 / 댓글 작성자의 닉네임 / 댓글 작성 시간 / 댓글 내용 
public class Comment {

	private String writerProfileImage;
	private String writerNickname;
	private String writeDatetime;
	private String contents;
	
	public Comment(String writerProfileImage, String writerNickname, String writeDatetime, String contents) {
		this.writerProfileImage = writerProfileImage;
		this.writerNickname = writerNickname;
		this.writeDatetime = writeDatetime;
		this.contents = contents;
	}

	public String getWriterProfileImage() {
		return writerProfileImage;
	}

	public void setWriterProfileImage(String writerProfileImage) {
		this.writerProfileImage = writerProfileImage;
	}

	public String getWriterNickname() {
		return writerNickname;
	}

	public void setWriterNickname(String writerNickname) {
		this.writerNickname = writerNickname;
	}

	public String getWriteDatetime() {
		return writeDatetime;
	}

	public String getContents() {
		return contents;
	}
	
}
