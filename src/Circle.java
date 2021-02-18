
public class Circle implements Shape {
	private double radius;
	
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}



	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");

	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	public double getRadius() {
		return this.radius;
	}

}
