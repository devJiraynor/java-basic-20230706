package com.seojihoon.board.service.implement;

import com.seojihoon.board.dto.request.SignUpRequestDto;
import com.seojihoon.board.dto.response.SignUpResponseDto;
import com.seojihoon.board.entity.User;
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
		if (hasEmail) return new SignUpResponseDto(false, "중복된 이메일입니다.");
		
		// 전화번호 중복 확인
		boolean hasTelNumber = userRepository.existsByTelNumber(telNumber);
		if (hasTelNumber) return new SignUpResponseDto(false, "중복된 전화번호입니다.");
		
		// 닉네임 중복 확인
		boolean hasNickname = userRepository.existsByNickname(nickname);
		if (hasNickname) return new SignUpResponseDto(false, "중복된 닉네임입니다.");
		
		// Entity 생성
		User user = new User(dto);
		
		// Entity 저장
		boolean result = userRepository.create(user);
		if (!result) return new SignUpResponseDto(false, "데이터베이스 오류입니다.");
		
		return new SignUpResponseDto(true, "성공");
	}

}



