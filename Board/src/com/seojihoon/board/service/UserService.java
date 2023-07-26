package com.seojihoon.board.service;

import com.seojihoon.board.dto.request.SignInRequestDto;
import com.seojihoon.board.dto.request.SignUpRequestDto;
import com.seojihoon.board.dto.response.ResponseEntity;
import com.seojihoon.board.dto.response.SignInResponseDto;
import com.seojihoon.board.dto.response.SignUpResponseDto;

public interface UserService {
	ResponseEntity<SignUpResponseDto> signUp(SignUpRequestDto dto);
	ResponseEntity<SignInResponseDto> signIn(SignInRequestDto dto);
}
