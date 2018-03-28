package challenge4.shapes2d;


public class Circle extends Oval {
	

	public Circle(double radius) {
		super(radius, radius);
		shapeType = "Circle";
	}
	

	@Override
	public double getPerimeter() {
		return 2 * 3.14159 * radius1;
	}


	@Override
	public String getShapeSpecificToStringParameters() {
		return radius1 + " inch radius";
	}
	
}
