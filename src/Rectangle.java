
public class Rectangle implements Shape {
	private double width;
	private double height;
	
	

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing rectangle");

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

}
