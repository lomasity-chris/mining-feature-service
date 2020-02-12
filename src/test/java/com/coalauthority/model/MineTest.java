package com.coalauthority.model;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MineTest {

	private Boundary boundary;

	@Before
	public void setup() {
		boundary = new Boundary(new Coordinate(1, 2), new Coordinate(4, 2), new Coordinate(4, 5), new Coordinate(1, 5));
	}

	@Test
	public void testNorthernBoundary() {

		Mine mine = new Mine(4, 3, 1);
		assertThat(mine.isWithinBoundary(boundary), equalTo(true));
	}
	
	@Test
	public void testEasternBoundary() {

		Mine mine = new Mine(3, 5, 1);
		assertThat(mine.isWithinBoundary(boundary), equalTo(true));
	}
	
	@Test
	public void testSouthernBoundary() {

		Mine mine = new Mine(1, 3, 1);
		assertThat(mine.isWithinBoundary(boundary), equalTo(true));
	}
	
	@Test
	public void testWestenBoundary() {

		Mine mine = new Mine(3, 2, 1);
		assertThat(mine.isWithinBoundary(boundary), equalTo(true));
	}

	
	@Test
	public void testMinesNorthOfBoundaryAreOutside() {

		Mine mine = new Mine(5, 2, 1);
		assertThat(mine.isWithinBoundary(boundary), equalTo(false));
	}

	@Test
	public void testMinesEastOfBoundaryAreOutside() {

		Mine mine = new Mine(4, 6, 1);
		assertThat(mine.isWithinBoundary(boundary), equalTo(false));
	}

	@Test
	public void testMinesSouthOfBoundaryAreOutside() {

		Mine mine = new Mine(0, 2, 1);
		assertThat(mine.isWithinBoundary(boundary), equalTo(false));
	}

	@Test
	public void testMinesWestOfBoundaryAreOutside() {

		Mine mine = new Mine(4, 1, 1);
		assertThat(mine.isWithinBoundary(boundary), equalTo(false));
	}

}
