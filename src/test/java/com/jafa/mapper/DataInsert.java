package com.jafa.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jafa.config.AppTest;
import com.jafa.model.Board;

public class DataInsert extends AppTest {

	@Autowired
	BoardMapper mapper;
	
	@Test
	public void insertData() {
		for (int i = 0; i < 412; i++) {
			Board board = new Board();
			board.setTitle("제목" +i);
			board.setContent("내용" +i);
			board.setWriter("작성자" +i);
			mapper.insert(board);
			
		}
	}
}
