package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.enums.MarkType;

class CellTest {

	private Cell cell;
	
	@BeforeEach
	public void init() {
		cell = new Cell();
	}

	@Test
	void testCell() {
		fail("Not yet implemented");
	}

	@Test
	void testIsEmpty() {
		for(int i = 0; i<9; i++) {
			
			cell.setMark(MarkType.EMPTY);
		}
		assertTrue(cell.isEmpty());
	}

	@Test
	void testSetMark() {
		fail("Not yet implemented");
	}

}
