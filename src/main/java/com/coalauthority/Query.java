package com.coalauthority;

import java.util.ArrayList;
import java.util.List;

import com.coalauthority.model.Boundary;
import com.coalauthority.model.Coordinate;
import com.coalauthority.model.Mine;

public class Query {
	
	public static void main(String[] args) {
		
		Query query = new Query();

		Boundary boundary = new Boundary(new Coordinate(1, 2), new Coordinate(4, 2), new Coordinate(4, 5),
				new Coordinate(1, 5));
		
		List<Mine> minesInBoundary = query.getMinesInBoundary(boundary);

		for (Mine mine : minesInBoundary) {
			System.out.println(mine.toString());
		}
	}

	public List<Mine> getMinesInBoundary(Boundary boundary) {
		
		List<Mine> minesInBoundary = new ArrayList<Mine>();

		for (Mine mine : PseudoDatabase.readMines()) {
			if (mine.isWithinBoundary(boundary)) {
				minesInBoundary.add(mine);
			}
		}
		
		return minesInBoundary;
	}

}
