package com.coalauthority.model;

public class Claim {
	
	private int latitude;
	private int longitude;
	private int claimValue;
	
	public Claim(int latitude, int longitude, int claimValue) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.claimValue = claimValue;
	}

	public int getLatitude() {
		return latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public int getClaimValue() {
		return claimValue;
	}
}
