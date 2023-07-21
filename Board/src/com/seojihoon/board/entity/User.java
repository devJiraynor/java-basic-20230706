package com.seojihoon.board.entity;


// 이메일 / 비밀번호 / 닉네임 / 휴대전화번호 / 주소 / 상세주소 / 개인정보동의 여부 / 프로필 사진
public class User {

	private String email;
	private String password;
	private String nickname;
	private String telNumber;
	private String address;
	private String addressDetail;
	private boolean agreedPersonal;
	private String profileImage;
	
	public User(String email, String password, String nickname, String telNumber, String address, String addressDetail,
			boolean agreedPersonal) {
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.telNumber = telNumber;
		this.address = address;
		this.addressDetail = addressDetail;
		this.agreedPersonal = agreedPersonal;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public boolean isAgreedPersonal() {
		return agreedPersonal;
	}
	
}
