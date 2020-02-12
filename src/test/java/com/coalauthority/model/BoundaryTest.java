package com.coalauthority.model;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BoundaryTest {

	private Boundary boundary;

	@Before
	public void setup() {
		boundary = new Boundary(new Coordinate(1, 2), new Coordinate(4, 2), new Coordinate(4, 5),
				new Coordinate(1, 5));
	}

	@Test
	public void minLatitudeIsSetCorrectly() {
		
		assertThat(boundary.getMinLatitude(), equalTo(1));
	}

	@Test
	public void minLongitudeIsSetCorrectly() {
		
		assertThat(boundary.getMinLongitude(), equalTo(2));
	}
	
	@Test
	public void maxLatitudeIsSetCorrectly() {
		
		assertThat(boundary.getMaxLatitude(), equalTo(4));
	}
	
	@Test
	public void maxLongitudeIsSetCorrectly() {
		
		assertThat(boundary.getMaxLongitude(), equalTo(5));
	}
}
