package com.seojihoon.board.service.implement;

import com.seojihoon.board.dto.request.SignUpRequestDto;
import com.seojihoon.board.dto.response.SignUpResponseDto;
import com.seojihoon.board.repository.UserRepository;
import com.seojihoon.board.repository.implement.UserRepositoryImplement;
import com.seojihoon.board.service.UserService;

public class UserServiceImplement implements UserService {
	
	private final UserRepository userRepository;
	
	public UserServiceImplement(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public SignUpResponseDto signUp(SignUpRequestDto dto) {
		
		String email = dto.getEmail();
		String telNumber = dto.getTelNumber();
		String nickname = dto.getNickname();
		
		// 이메일 중복 확인
		boolean hasEmail = userRepository.existsByEmail(email);
		if (hasEmail) return null;
		
		// 전화번호 중복 확인
		boolean hasTelNumber = userRepository.existsByTelNumber(telNumber);
		if (hasTelNumber) return null;
		
		// 닉네임 중복 확인
		boolean hasNickname = userRepository.existsByNickname(nickname);
		if (hasNickname) return null;
		
		// Entity 생성
		
		// Entity 저장
		
		return null;
	}

}



