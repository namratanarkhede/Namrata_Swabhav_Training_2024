package com.aurionpro.model;

import com.aurionpro.enums.MarkType;
import com.aurionpro.exceptions.CellAlreadyMarkedException;

public class Board {
	private Cell[] cells = new Cell[9];
	
	public Board() {
		super();
		for(int i = 0;  i < cells.length; i++) {
			cells[i] = new Cell();
		}
	}
	
	public Cell[] getCells() {
		return cells;
	}

	public void setCells(int loc, MarkType mark) {
		if (loc<0 || loc>8) {
			throw new CellAlreadyMarkedException();
		}
		cells[loc].setMark(mark);
	}

	public boolean isBoardFull() {
		for( Cell cell:cells) {
			if(cell.getMark() == MarkType.EMPTY) {
				return false;
			}
		}

		return true;
	}
	

}
