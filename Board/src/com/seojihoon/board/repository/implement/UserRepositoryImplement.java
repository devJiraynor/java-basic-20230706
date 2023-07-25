package com.seojihoon.board.repository.implement;

import com.seojihoon.board.entity.User;
import com.seojihoon.board.repository.UserRepository;

public class UserRepositoryImplement implements UserRepository {

	@Override
	public boolean create(User entity) {
		// entity가 null 인지?
		if (entity == null) return false;
		// 필수 값이 모두 입력되었는지?
		if (!entity.isCreateValid()) return false;
		
		USERS.add(entity);
		
		return true;
	}

	@Override
	public User read(String key) {
		User result = null;
		
		if (key == null) return result;
		
		for(User user: USERS) {
			String email = user.getEmail();
			
			if (email.equals(key)) {
				result = user;
				break;
			}
		}
		
		return result;
	}

	@Override
	public boolean update(User entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String key) {
		// TODO Auto-generated method stub
		return false;
	}

}
