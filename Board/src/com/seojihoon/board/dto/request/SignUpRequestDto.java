package com.seojihoon.board.dto.request;

import com.seojihoon.board.common.PatternValidator;

// 이메일주소, 비밀번호, 비밀번호확인
// 닉네임, 핸드폰번호, 주소, 상세 주소, 개인정보동의여부
public class SignUpRequestDto {

	private String email;
	private String password;
	private String passwordCheck;
	private String nickname;
	private String telNumber;
	private String address;
	private String addressDetail;
	private boolean agreedPersonal;
	
	public SignUpRequestDto() {}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordCheck() {
		return passwordCheck;
	}

	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public boolean isAgreedPersonal() {
		return agreedPersonal;
	}

	public void setAgreedPersonal(boolean agreedPersonal) {
		this.agreedPersonal = agreedPersonal;
	}
	
	public boolean valid() {
		if (email == null || password == null || passwordCheck == null ||
				nickname == null || telNumber == null || address == null || 
				!agreedPersonal) {
			return false;
		}
		
		if (email.isBlank() || password.isBlank() || passwordCheck.isBlank() ||
				nickname.isBlank() || telNumber.isBlank() || address.isBlank()) {
			return false;
		}
		
		if (password.length() < 8) {
			return false;
		}
		
		if (!password.equals(passwordCheck)) {
			return false;
		}
        
		boolean emailCheck = PatternValidator.isValidEmail(email);
        if (!emailCheck) {
        	return false;
        }
        
        boolean telNumberCheck = PatternValidator.isValidTelNumber(telNumber);
        if (!telNumberCheck) {
        	return false;
        }
        
		return true;
	}
	
}






