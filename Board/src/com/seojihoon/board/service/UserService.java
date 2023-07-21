package com.seojihoon.board.service;

import com.seojihoon.board.dto.request.SignUpRequestDto;
import com.seojihoon.board.dto.response.SignUpResponseDto;

public interface UserService {
	SignUpResponseDto signUp(SignUpRequestDto dto);
}
