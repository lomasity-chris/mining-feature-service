package com.coalauthority;

import java.util.ArrayList;
import java.util.List;

import com.coalauthority.model.Claim;
import com.coalauthority.model.Mine;

public class PseudoDatabase {
	
	private static List<Mine> mines;
	private static List<Claim> claims;
	
	static {
	
		mines = new ArrayList<Mine>();
		mines.add(new Mine(4, 3, 120));
		mines.add(new Mine(7, 9, 80));
		mines.add(new Mine(9, 3, 90));
		mines.add(new Mine(2, 2, 250));
		mines.add(new Mine(8, 5, 50));
		mines.add(new Mine(2, 2, 250));

		claims = new ArrayList<Claim>();
		claims.add(new Claim(2, 5, 10000));
		claims.add(new Claim(1, 4, 500));
	}
	
	public static List<Mine> readMines() {
		return mines;
	}

	public static List<Claim> readClaims() {
		return claims;
	}


	
}
