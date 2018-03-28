package challenge4.shapes3d;


public class Sphere extends Shape3D {
	
	public double radius;

	public Sphere(double radius) {
		super("Sphere");
		this.radius = radius;
	}
	
	
	public double getSurfaceArea() {
		return 4 * PI * Math.pow(radius, 2);
	}


	public double getVolume() {
		return 4/3 * PI * Math.pow(radius, 3);
	}

	
	@Override
	public String getShapeSpecificToStringParameters() {
		return radius + " inch radius";
	}
	
	
}
