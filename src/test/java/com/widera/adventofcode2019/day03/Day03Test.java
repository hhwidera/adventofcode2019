package com.widera.adventofcode2019.day03;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day03Test {

	@Test
	public void testExampleA() {
		assertEquals(6, Day03.manhattenDistance("R8,U5,L5,D3", "U7,R6,D4,L4"));
	}

	@Test
	public void testExampleB() {
		assertEquals(159, Day03.manhattenDistance("R75,D30,R83,U83,L12,D49,R71,U7,L72", "U62,R66,U55,R34,D71,R55,D58,R83"));
	}

	@Test
	public void testExampleC() {
		assertEquals(135, Day03.manhattenDistance("R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51", "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7"));
	}

	@Test
	public void testStepDistanceExampleA() {
		assertEquals(30, Day03.stepDistance("R8,U5,L5,D3", "U7,R6,D4,L4"));
	}

	@Test
	public void testStepDistanceExampleB() {
		assertEquals(610, Day03.stepDistance("R75,D30,R83,U83,L12,D49,R71,U7,L72", "U62,R66,U55,R34,D71,R55,D58,R83"));
	}

	@Test
	public void testStepDistanceExampleC() {
		assertEquals(410, Day03.stepDistance("R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51", "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7"));
	}
}