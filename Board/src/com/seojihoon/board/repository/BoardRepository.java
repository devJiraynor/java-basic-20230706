package com.seojihoon.board.repository;

import java.util.ArrayList;
import java.util.List;

import com.seojihoon.board.entity.Board;

public interface BoardRepository extends Repository<Board, Integer> {
	
	// 게시물 정보를 저장할 Board Entity List
	public static final List<Board> BOARDS = new ArrayList<Board>();
	
}





