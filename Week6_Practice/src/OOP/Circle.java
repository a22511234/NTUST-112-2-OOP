package OOP;

public class Circle extends GeometricObject {

	private double radius;

	public Circle(double _radius) {
		radius = _radius;
	}

	public Circle(double _radius, String color, boolean filled) {
		// super();
		radius = _radius;
		super.color = color;
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String showinfo() {
		return "This is Circle!";
	}

}
