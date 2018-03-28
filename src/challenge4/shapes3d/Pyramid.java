package challenge4.shapes3d;


public class Pyramid extends Shape3D {
	
	public double baseLength, height;

	public Pyramid(double baseLength, double height) {
		super("Pyramid");
		this.baseLength = baseLength;
		this.height = height;
	}
	
	
	public double getSurfaceArea() {
		return Math.pow(baseLength, 2) + 2 * baseLength * Math.sqrt((Math.pow(baseLength, 2) / 4) + Math.pow(height, 2));
	}


	public double getVolume() {
		return Math.pow(baseLength, 2) * (height / 3);
	}


	@Override
	public String getShapeSpecificToStringParameters() {
		return baseLength + " inch base-sides | " + height + " inches tall";
	}
	
}
