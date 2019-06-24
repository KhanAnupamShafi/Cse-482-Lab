package lab02;

public class MyCircle {
	private MyPoint center;
	private int radious;
	
	public MyCircle() {
		
		this.center = new MyPoint(0,0);
		this.radious = 1;
	}
	
	public MyCircle(int x, int y, int radious) {
		this.center = new MyPoint(x,y);
		this.radious = Math.abs(radious);
	}

	public MyCircle(MyPoint center, int radious) {
		this.center = center;
		this.radious = radious;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadious() {
		return radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}
	
	public int getCenterX() {
		return center.getX();
	}
	public int getCenterY() {
		return center.getY();
	}
	
	public void setCenterX(int x) {
		this.center.setX(x);
	}
	public void setCenterY(int y) {
		this.center.setX(y);
	}
	
	public int[] getCenterXY() {
		int [] point = {center.getX(),center.getY()};
		return  point;
	}
	public void setCenterXY(int x, int y) {
		this.center.setX(x); 
		this.center.setY(y);
	}

	@Override
	public String toString() {
		return "MyCircle [center=" + center + ", radious=" + radious + "]";
	}
	
	public double getArea() {
		return  Math.PI * this.radious * this.radious;
	}
	
	public double getCircumference() {
		return  2 * Math.PI * this.radious;
	}
	// Returns the distance of the center for this MyCircle and another MyCircle
	public double distance(MyCircle another) {
	   return center.distance(another.center); // use distance() of MyPoint
	}
	
}
