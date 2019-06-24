package lab02;

public class MyPoint {
	private int x,y;
	
	public MyPoint() {
		this.x =x; this.y= y;
	}

	public MyPoint(int x, int y) {
		this.x = x;	this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y =y;
	}
	public int[] getXY() {
		int [] point = {x,y};
		return  point;
	}
	public double distance(int x, int y) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	public double distance() {
		return Math.sqrt(x*x + x*x);
	}
	
	// This version takes a MyPoint instance as argument
	public double distance(MyPoint another) {
	   int xDiff = this.x - another.x;
	   int yDiff = this.y - another.y;
	   return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	   
	}

	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}
	
	
}
