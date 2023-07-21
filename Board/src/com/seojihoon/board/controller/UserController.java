package com.seojihoon.board.controller;

import com.seojihoon.board.dto.request.SignUpRequestDto;
import com.seojihoon.board.dto.response.SignUpResponseDto;

public interface UserController {
	SignUpResponseDto signUp(SignUpRequestDto requestDto);
}
