package com.coalauthority;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.Test;

import com.coalauthority.model.Boundary;
import com.coalauthority.model.Coordinate;
import com.coalauthority.model.Mine;

public class QueryTest {
	
	@Test
	public void testReturnsCorrectMines() {
		
		Query query = new Query();
		
		Boundary boundary = new Boundary(new Coordinate(1, 2), new Coordinate(4, 2), new Coordinate(4, 5),
				new Coordinate(1, 5));
		
		List<Mine> minesInBoundary = query.getMinesInBoundary(boundary);
		
		assertThat(minesInBoundary.get(0).getLatitude(), equalTo(4));  
		assertThat(minesInBoundary.get(0).getLongitude(), equalTo(3));
		
		assertThat(minesInBoundary.get(1).getLatitude(), equalTo(2));  
		assertThat(minesInBoundary.get(1).getLongitude(), equalTo(2));
		
		assertThat(minesInBoundary.get(2).getLatitude(), equalTo(2));  
		assertThat(minesInBoundary.get(2).getLongitude(), equalTo(2));
	}
	
}
