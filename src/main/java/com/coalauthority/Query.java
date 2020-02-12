package com.coalauthority;

import java.util.ArrayList;
import java.util.List;

import com.coalauthority.model.Boundary;
import com.coalauthority.model.Claim;
import com.coalauthority.model.Coordinate;
import com.coalauthority.model.Mine;

public class Query {

	public static void main(String[] args) {

		Query query = new Query();

		List<Boundary> boundaries = new ArrayList<Boundary>();
		boundaries.add(
				new Boundary(new Coordinate(1, 2), new Coordinate(4, 2), new Coordinate(4, 5), new Coordinate(1, 5)));
		boundaries.add(
				new Boundary(new Coordinate(8, 2), new Coordinate(9, 2), new Coordinate(9, 3), new Coordinate(8, 3)));

		List<Mine> minesInBoundary = query.getMinesInBoundaries(boundaries);
		List<Claim> claimsInBoundary = query.getClaimsInBoundaries(boundaries);

		for (Mine mine : minesInBoundary) {
			System.out.println(mine.toString());
		}
		
		for (Claim claim : claimsInBoundary) {
			System.out.println(claim.toString());
		}
	}

	public List<Mine> getMinesInBoundaries(List<Boundary> boundaries) {

		List<Mine> minesInBoundaries = new ArrayList<Mine>();

		for (Boundary boundary : boundaries) {
			List<Mine> minesInBoundary = getMinesInBoundary(boundary);
			minesInBoundaries.addAll(minesInBoundary);
		}

		return minesInBoundaries;
	}

	public List<Claim> getClaimsInBoundaries(List<Boundary> boundaries) {

		List<Claim> claimsInBoundaries = new ArrayList<Claim>();

		for (Boundary boundary : boundaries) {
			List<Claim> claimsInBoundary = getClaimsInBoundary(boundary);
			claimsInBoundaries.addAll(claimsInBoundary);
		}

		return claimsInBoundaries;
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

	public List<Claim> getClaimsInBoundary(Boundary boundary) {

		List<Claim> claimsInBoundary = new ArrayList<Claim>();

		for (Claim claim : PseudoDatabase.readClaims()) {
			if (claim.isWithinBoundary(boundary)) {
				claimsInBoundary.add(claim);
			}
		}

		return claimsInBoundary;
	}

}
