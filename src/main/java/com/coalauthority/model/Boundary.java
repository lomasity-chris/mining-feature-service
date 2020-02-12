package com.coalauthority.model;

public class Boundary {
	
	private int minLatitude;
	private int maxLatitude;
	private int minLongitude;
	private int maxLongitude;
	
	public Boundary(final Coordinate... coordinates) {
		
		minLatitude = Integer.MAX_VALUE;
		maxLatitude = Integer.MIN_VALUE;
		minLongitude = Integer.MAX_VALUE;
		maxLongitude = Integer.MIN_VALUE;
		
		for (int i=0; i < coordinates.length; i++) {
			
			if (coordinates[i].getLatitude() < minLatitude) {
				this.minLatitude = coordinates[i].getLatitude(); 
			}
			
			if (coordinates[i].getLatitude() > maxLatitude) {
				this.maxLatitude = coordinates[i].getLatitude(); 
			}
			
			if (coordinates[i].getLongitude() < minLongitude) {
				this.minLongitude = coordinates[i].getLongitude(); 
			}
			
			if (coordinates[i].getLongitude() > maxLongitude) {
				this.maxLongitude = coordinates[i].getLongitude(); 
			}
		}
	}

	public int getMinLatitude() {
		return minLatitude;
	}
	
	public int getMaxLatitude() {
		return maxLatitude;
	}
	
	public int getMinLongitude() {
		return minLongitude;
	}
	
	public int getMaxLongitude() {
		return maxLongitude;
	}
	
}
