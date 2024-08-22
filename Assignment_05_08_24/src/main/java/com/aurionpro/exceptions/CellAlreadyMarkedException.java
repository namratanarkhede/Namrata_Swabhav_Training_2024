package com.aurionpro.exceptions;

public class CellAlreadyMarkedException extends RuntimeException {

	public String getMessage() {
		return "Cell is Not Empty";
	}
}
