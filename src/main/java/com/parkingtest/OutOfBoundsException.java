package com.parkingtest;

/**
 * Exception to be thrown when out of bounds.
 */
@SuppressWarnings("serial")
public class OutOfBoundsException extends RuntimeException {

	private Position position;

	public OutOfBoundsException(Position position) {
		super("Out of bounds at position " + position.getHorizontalAxis() + "," + position.getVerticalAxis());
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}
}
