package com.seojihoon.board;

import java.util.Scanner;

import com.seojihoon.board.controller.UserController;
import com.seojihoon.board.controller.implement.UserControllerImplement;
import com.seojihoon.board.dto.request.SignUpRequestDto;
import com.seojihoon.board.dto.response.SignUpResponseDto;
import com.seojihoon.board.repository.UserRepository;
import com.seojihoon.board.repository.implement.UserRepositoryImplement;
import com.seojihoon.board.service.UserService;
import com.seojihoon.board.service.implement.UserServiceImplement;

public class BoardApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		UserRepository userRepository = new UserRepositoryImplement();
		UserService userService = new UserServiceImplement(userRepository);
		UserController userController = new UserControllerImplement(userService);
		
		SignUpRequestDto dto = new SignUpRequestDto();
		
		System.out.println("이메일 : ");
		dto.setEmail(scanner.nextLine());
		System.out.println("비밀번호 : ");
		dto.setPassword(scanner.nextLine());
		System.out.println("비밀번호 확인 : ");
		dto.setPasswordCheck(scanner.nextLine());
		System.out.println("닉네임 : ");
		dto.setNickname(scanner.nextLine());
		System.out.println("전화번호 : ");
		dto.setTelNumber(scanner.nextLine());
		System.out.println("주소 : ");
		dto.setAddress(scanner.nextLine());
		System.out.println("상세 주소 : ");
		dto.setAddressDetail(scanner.nextLine());
		System.out.println("개인정보 처리 동의 : ");
		dto.setAgreedPersonal(scanner.nextBoolean());
		
		SignUpResponseDto result = userController.signUp(dto);
		System.out.println(result.toString());
		
	}

}




