package com.widera.adventofcode2019.day03;

import java.util.Objects;

public class Position {

	public static final Position START = new Position(0, 0);
	public static final Position STEP_UP = new Position(0, 1);
	public static final Position STEP_DOWN = new Position(0, -1);
	public static final Position STEP_RIGHT = new Position(1, 0);
	public static final Position STEP_LEFT = new Position(-1, 0);
	public static final Position ERROR = new Position(Integer.MAX_VALUE/2, Integer.MAX_VALUE/2);

	private final int x;
	private final int y;
	private final int step;

	public Position(final int x, final int y) {
		this(x, y, 0);
	}

	public Position(final int x, final int y, final int step) {
		this.x = x;
		this.y = y;
		this.step = step;
	}

	public Position add(final Position other) {
		return new Position(this.x + other.x, this.y + other.y , this.step + 1);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Position position = (Position) o;
		return x == position.x &&
				y == position.y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	public int manhattenDistance() {
		return Math.abs(x) + Math.abs(y);
	}

	public int step() {
		return step;
	}

	@Override
	public String toString() {
		return "{" + x + ",\t" + y + "}";
	}
}
