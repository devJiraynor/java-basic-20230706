package com.seojihoon.board.repository;

import java.util.ArrayList;
import java.util.List;

import com.seojihoon.board.entity.User;

public interface UserRepository extends Repository<User, String> {

	// 유저 정보를 저장할 User Entity List
	public static final List<User> USERS = new ArrayList<User>();
	
}







