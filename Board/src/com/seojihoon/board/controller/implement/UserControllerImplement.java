package com.seojihoon.board.controller.implement;

import com.seojihoon.board.controller.UserController;
import com.seojihoon.board.dto.request.SignUpRequestDto;
import com.seojihoon.board.dto.response.ResponseEntity;
import com.seojihoon.board.dto.response.SignUpResponseDto;
import com.seojihoon.board.service.UserService;

public class UserControllerImplement implements UserController {
	
	private final UserService userService;
	
	public UserControllerImplement(UserService userService) {
		this.userService = userService;
	}

	@Override
	public ResponseEntity<SignUpResponseDto> signUp(SignUpRequestDto requestDto) {
		boolean isValid = requestDto.valid();
		if (!isValid) return new ResponseEntity<SignUpResponseDto>(400, "올바르지 않은 입력입니다.", null);
		
		ResponseEntity<SignUpResponseDto> result = userService.signUp(requestDto);
		return result;
	}

}
