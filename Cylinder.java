package lab02;

public class Cylinder extends Circle{
	
	private double height;

	public Cylinder() {
		this.height = 0.0;
	}
	
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	public Cylinder(double radious,double height) {
		
		super(radious);
		this.height = height;
	}
	public Cylinder(double radious,double height,String color) {
		super(radious,color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return Math.PI * super.getArea()* this.height;
	}
	@Override
	public String toString() {      // in Cylinder class
	   return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
	          + " height=" + height;
	}
	
}
