package com;

public class Position {
	
	int fromCorr;
	int toCorr;
	
	String positionType; //SNAKE, LADDER and EMPTY
	
	Position(int fromCorr, int toCorr){
		this.fromCorr = fromCorr;
		this.toCorr = toCorr;
	}

	public int getFromCorr() {
		return fromCorr;
	}

	public void setFromCorr(int fromCorr) {
		this.fromCorr = fromCorr;
	}

	public int getToCorr() {
		return toCorr;
	}

	public void setToCorr(int toCorr) {
		this.toCorr = toCorr;
	}

	public String getPositionType() {
		return positionType;
	}

	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}
	
	

	
	
	

}//end 
