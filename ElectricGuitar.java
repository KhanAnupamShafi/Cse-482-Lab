package cse482.diptu.lab1;

public class ElectricGuitar {
	String brand;
	private int numOfPickups;
	boolean rockStarUsesIt;
	String getBrand() {
	return brand;
	}
	void setBrand(String aBrand) {
	brand = aBrand;
	}
	private int getNumOfPickups() {
	return numOfPickups;
	}
	void setNumOfPickups(int num) {
	numOfPickups = num;
	}
	boolean getRockStarUsesIt() {
	return rockStarUsesIt;
	}
	void setRockStarUsesIt(boolean yesOrNo) {
	rockStarUsesIt = yesOrNo;
	}
}
