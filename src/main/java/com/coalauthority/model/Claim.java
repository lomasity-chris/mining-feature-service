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
	
	public boolean isWithinBoundary(final Boundary boundary) {

		return this.latitude >= boundary.getMinLatitude() 
			&& this.latitude <= boundary.getMaxLatitude()
			&& this.longitude >= boundary.getMinLongitude() 
			&& this.longitude <= boundary.getMaxLongitude();
	}

	@Override
	public String toString() {
		return "Claim [latitude=" + latitude + ", longitude=" + longitude + ", claimValue=" + claimValue + "]";
	}
}
