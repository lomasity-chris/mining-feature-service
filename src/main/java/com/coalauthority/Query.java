package com.coalauthority;

import com.coalauthority.model.Boundary;
import com.coalauthority.model.Coordinate;
import com.coalauthority.model.Mine;

public class Query {

	public static void main(String[] args) {

		Boundary boundary = new Boundary(new Coordinate(1, 2), new Coordinate(4, 2), new Coordinate(4, 5),
				new Coordinate(1, 5));

		for (Mine mine : PseudoDatabase.readMines()) {
			if (mine.isWithinBoundary(boundary)) {
				System.out.println(mine.toString());
			}
		}
	}

}
