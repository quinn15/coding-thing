package main.util;

public class Coordinate {

	private double x = 0;
	private double y = 0;
	
	public Coordinate(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		if (x / Math.abs(x) == 1) {
			this.x = x;
		} else {
			try {
				throw new CustomException("Number Cannot Be Negative");
			} catch (CustomException e) {
				e.printStackTrace();
			}
		}
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		if (y / Math.abs(y) == 1) {
			this.y = y;
		} else {
			try {
				throw new CustomException("Number Cannot Be Negative");
			} catch (CustomException e) {
				e.printStackTrace();
			}
		}
	}
	
}
