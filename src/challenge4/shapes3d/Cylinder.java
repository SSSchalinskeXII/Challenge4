package challenge4.shapes3d;


public class Cylinder extends Shape3D {
	
	public double radius, height;

	public Cylinder(double radius, double height) {
		super("Cylinder");
		this.radius = radius;
		this.height = height;
	}
	
	
	public double getSurfaceArea() {
		return 2 * PI * radius * height + 2 * PI * Math.pow(radius, 2);
	}
	

	public double getVolume() {
		return PI * Math.pow(radius, 2) * height;
	}


	@Override
	public String getShapeSpecificToStringParameters() {
		return radius + " inch radius | " + height + " inches tall";
	}
	
}
