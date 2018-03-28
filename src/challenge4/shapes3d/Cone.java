package challenge4.shapes3d;


public class Cone extends Shape3D {

	public double radius, height;

	public Cone(double radius, double height) {
		super("Cone");
		this.radius = radius;
		this.height = height;
	}
	
	
	public double getSurfaceArea() {
		return PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
	}
	

	public double getVolume() {
		return PI * Math.pow(radius, 2) * (height / 3);
	}

	
	@Override
	public String getShapeSpecificToStringParameters() {
		return radius + " inch radius | " + height + " inches tall";
	}
	
	
}
