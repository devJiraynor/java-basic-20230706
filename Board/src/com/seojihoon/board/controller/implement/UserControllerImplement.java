package com.seojihoon.board.controller.implement;

import com.seojihoon.board.controller.UserController;
import com.seojihoon.board.dto.request.SignUpRequestDto;
import com.seojihoon.board.dto.response.SignUpResponseDto;
import com.seojihoon.board.service.UserService;

public class UserControllerImplement implements UserController {
	
	private final UserService userService;
	
	public UserControllerImplement(UserService userService) {
		this.userService = userService;
	}

	@Override
	public SignUpResponseDto signUp(SignUpRequestDto requestDto) {
		boolean isValid = requestDto.valid();
		if (!isValid) return new SignUpResponseDto(false, "올바르지 않은 입력입니다.");
		
		SignUpResponseDto result = userService.signUp(requestDto);
		return result;
	}

}
