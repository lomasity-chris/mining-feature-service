package com.coalauthority.model;

public class Mine {

	private int latitude;
	private int longitude;
	private int mineEntryDepth;

	public Mine(int latitude, int longitude, int mineEntryDepth) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.mineEntryDepth = mineEntryDepth;
	}

	public int getLatitude() {
		return latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public int getMineEntryDepth() {
		return mineEntryDepth;
	}

	public boolean isWithinBoundary(final Boundary boundary) {

		return this.latitude >= boundary.getMinLatitude() 
			&& this.latitude <= boundary.getMaxLatitude()
			&& this.longitude >= boundary.getMinLongitude() 
			&& this.longitude <= boundary.getMaxLongitude();
	}

	@Override
	public String toString() {
		return "Mine [latitude=" + latitude + ", longitude=" + longitude + ", mineEntryDepth=" + mineEntryDepth + "]";
	}

	
}
