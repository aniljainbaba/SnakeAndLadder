package com;

import java.util.Objects;

public class Snake {
	Position fromPosition;
	Position toPosition;
	
	public Snake(Position fromPosition, Position toPosition) {
		// TODO Auto-generated constructor stub
		this.fromPosition = fromPosition;
		this.toPosition = toPosition;
		
	}

	public Position getFromPosition() {
		return fromPosition;
	}

	public void setFromPosition(Position fromPosition) {
		this.fromPosition = fromPosition;
	}

	public Position getToPosition() {
		return toPosition;
	}

	public void setToPosition(Position toPosition) {
		this.toPosition = toPosition;
	}
	
	
	
}//end snake
