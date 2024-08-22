package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.enums.MarkType;
import com.aurionpro.exceptions.CellAlreadyMarkedException;

class BoardTest {
	private Board board;
	
	@BeforeEach
	public void init() {
		board = new Board();
	}

	@Test
	void testSetCells() {
		board.setCells(3, MarkType.X);
		
		Cell cells[] = board.getCells();
		assertEquals(MarkType.X, cells[3].getMark());
		
		assertThrows(CellAlreadyMarkedException.class, ()-> board.setCells(3, MarkType.O));
	}

	@Test
	void testIsBoardFull() {
		for(int i = 0; i < 9; i++) {
			board.setCells(i, MarkType.X);
		}
		assertTrue(board.isBoardFull());
	}

}
