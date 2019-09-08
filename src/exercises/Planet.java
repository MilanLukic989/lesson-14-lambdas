package exercises;

public class Planet {

	private int distanceFromSun; // Average distance in millions of kilometers
	private String name;
	private double volume; // Relative to Earth which is 1.0
	private int satellites;

	public Planet(String name, int distanceFromSun, double volume, int satellites) {
		super();
		this.name = name;
		this.distanceFromSun = distanceFromSun;
		this.volume = volume;
		this.satellites = satellites;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistanceFromSun() {
		return distanceFromSun;
	}

	public void setDistanceFromSun(int distanceFromSun) {
		this.distanceFromSun = distanceFromSun;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public int getSatellites() {
		return satellites;
	}

	public void setSatellites(int satellites) {
		this.satellites = satellites;
	}

}
