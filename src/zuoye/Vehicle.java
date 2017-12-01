package zuoye;

public class Vehicle {
	private double speed;
	private String size;

	public Vehicle() {
		super();
	}

	public Vehicle(double speed, String size) {
		super();
		this.speed = speed;
		this.size = size;
	}

	public void move() {
		System.out.println("交通工具在移动");
	}

	public double speedUp(double upspeed) {
		return speed + upspeed;
	}

	public double speedDown(double downspeed) {
		return speed - downspeed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
