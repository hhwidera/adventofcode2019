package com.widera.adventofcode2019.day03;

import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

	@Test
	public void testR8() {
		Field field = new Field();
		assertEquals(0, field.visitedPositions().size());
		field.go("R8");
		assertEquals(8, field.visitedPositions().size());
		assertTrue(field.visitedPositions().contains(new Position(1, 0)));
		assertTrue(field.visitedPositions().contains(new Position(2, 0)));
		assertTrue(field.visitedPositions().contains(new Position(3, 0)));
		assertTrue(field.visitedPositions().contains(new Position(4, 0)));
		assertTrue(field.visitedPositions().contains(new Position(5, 0)));
		assertTrue(field.visitedPositions().contains(new Position(6, 0)));
		assertTrue(field.visitedPositions().contains(new Position(7, 0)));
		assertTrue(field.visitedPositions().contains(new Position(8, 0)));
	}

	@Test
	public void testU5() {
		Field field = new Field();
		assertEquals(0, field.visitedPositions().size());
		field.go("U5");
		assertEquals(5, field.visitedPositions().size());
		assertTrue(field.visitedPositions().contains(new Position(0, 1)));
		assertTrue(field.visitedPositions().contains(new Position(0, 2)));
		assertTrue(field.visitedPositions().contains(new Position(0, 3)));
		assertTrue(field.visitedPositions().contains(new Position(0, 4)));
		assertTrue(field.visitedPositions().contains(new Position(0, 5)));
	}

	@Test
	public void testR8U5L5D3() {
		Field field = new Field();
		assertEquals(0, field.visitedPositions().size());
		field.go("R8");
		field.go("U5");
		field.go("L5");
		field.go("D3");
		assertEquals(21, field.visitedPositions().size());
		assertTrue(field.visitedPositions().contains(new Position(3, 3)));
	}

}