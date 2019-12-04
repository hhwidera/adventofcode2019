package com.widera.adventofcode2019.day03;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Field {

	private final Set<Position> visitedPositions = new HashSet<>();

	private Position actualPosition;

	public Field() {
		this.actualPosition = Position.START;
	}

	public Field(final String input) {
		this();
		String[] steps = input.split(",");
		Arrays.stream(steps).forEach(this::go);
	}

	public void go(final String path) {
		Position direction = direction(path.substring(0, 1));
		int steps = Integer.parseInt(path.substring(1));
		for (int s = 0; s < steps; s++) {
			this.actualPosition = this.actualPosition.add(direction);
			this.visitedPositions.add(this.actualPosition);
		}
	}

	private Position direction(String directionAsString) {
		if ("U".equals(directionAsString)) {
			return Position.STEP_UP;
		}
		if ("D".equals(directionAsString)) {
			return Position.STEP_DOWN;
		}
		if ("R".equals(directionAsString)) {
			return Position.STEP_RIGHT;
		}
		return Position.STEP_LEFT;
	}

	public Set<Position> visitedPositions() {
		return Collections.unmodifiableSet(this.visitedPositions);
	}
}
