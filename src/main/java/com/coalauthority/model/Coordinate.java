package com.coalauthority.model;

public class Coordinate {
	
	private final int latitude;
	private final int longitude;
	
	public Coordinate(final int latitude, final int longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public int getLatitude() {
		return this.latitude;
	}

	public int getLongitude() {
		return this.longitude;
	}

}
