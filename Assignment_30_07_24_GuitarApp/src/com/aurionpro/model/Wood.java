package com.aurionpro.model;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD,
	MABOGANY, MAPLE, COCOBOLO;
	public String toString() {
		switch(this){
		case INDIAN_ROSEWOOD:
			return "INDIAN_ROSEWOOD";
		case BRAZILIAN_ROSEWOOD:
			return "BRAZILIAN_ROSEWOOD";
		case MABOGANY:
			return "MABOGANY";
		case MAPLE:
			return "MAPLE";
		case COCOBOLO:
			return "COCOBOLO";
		default:
			break;
			
		}
		
		
		
		return null;
		
	}

}
