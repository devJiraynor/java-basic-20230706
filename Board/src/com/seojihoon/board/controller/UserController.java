package com.seojihoon.board.controller;

import com.seojihoon.board.dto.request.SignInRequestDto;
import com.seojihoon.board.dto.request.SignUpRequestDto;
import com.seojihoon.board.dto.response.ResponseEntity;
import com.seojihoon.board.dto.response.SignInResponseDto;
import com.seojihoon.board.dto.response.SignUpResponseDto;

public interface UserController {
	ResponseEntity<SignUpResponseDto> signUp(SignUpRequestDto requestDto);
	ResponseEntity<SignInResponseDto> signIn(SignInRequestDto requestDto);
}
