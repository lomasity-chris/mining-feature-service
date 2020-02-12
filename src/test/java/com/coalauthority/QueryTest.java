package com.coalauthority;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.coalauthority.model.Boundary;
import com.coalauthority.model.Claim;
import com.coalauthority.model.Coordinate;
import com.coalauthority.model.Mine;

public class QueryTest {
	
	@Test
	public void testReturnsCorrectMinesInSingleBoundary() {
		
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
		
		assertThat(minesInBoundary.size(), equalTo(3));
	}
	
	@Test
	public void testReturnsCorrectMinesInAllBoundaries() {
		
		Query query = new Query();
		
		List<Boundary> boundaries = new ArrayList<Boundary>();
		boundaries.add(new Boundary(new Coordinate(1, 2), new Coordinate(4, 2), new Coordinate(4, 5), new Coordinate(1, 5)));
		boundaries.add(new Boundary(new Coordinate(8, 2), new Coordinate(9, 2), new Coordinate(9, 3), new Coordinate(8, 3)));
		
		List<Mine> minesInBoundary = query.getMinesInBoundaries(boundaries);
		
		assertThat(minesInBoundary.get(0).getLatitude(), equalTo(4));  
		assertThat(minesInBoundary.get(0).getLongitude(), equalTo(3));
		
		assertThat(minesInBoundary.get(1).getLatitude(), equalTo(2));  
		assertThat(minesInBoundary.get(1).getLongitude(), equalTo(2));
		
		assertThat(minesInBoundary.get(2).getLatitude(), equalTo(2));  
		assertThat(minesInBoundary.get(2).getLongitude(), equalTo(2));
		
		assertThat(minesInBoundary.get(3).getLatitude(), equalTo(9));  
		assertThat(minesInBoundary.get(3).getLongitude(), equalTo(3));
		
		assertThat(minesInBoundary.size(), equalTo(4));
	}
	
	@Test
	public void testReturnsCorrectClaimsInAllBoundaries() {
		
		Query query = new Query();
		
		List<Boundary> boundaries = new ArrayList<Boundary>();
		boundaries.add(new Boundary(new Coordinate(1, 2), new Coordinate(4, 2), new Coordinate(4, 5), new Coordinate(1, 5)));
		boundaries.add(new Boundary(new Coordinate(8, 2), new Coordinate(9, 2), new Coordinate(9, 3), new Coordinate(8, 3)));
		
		List<Claim> claimsInBoundary = query.getClaimsInBoundaries(boundaries);
		
		assertThat(claimsInBoundary.get(0).getLatitude(), equalTo(2));  
		assertThat(claimsInBoundary.get(0).getLongitude(), equalTo(5));
		assertThat(claimsInBoundary.get(0).getClaimValue(), equalTo(10000));
		
		assertThat(claimsInBoundary.get(1).getLatitude(), equalTo(1));  
		assertThat(claimsInBoundary.get(1).getLongitude(), equalTo(4));
		assertThat(claimsInBoundary.get(1).getClaimValue(), equalTo(500));
		
		assertThat(claimsInBoundary.size(), equalTo(2));
	}
	
}
