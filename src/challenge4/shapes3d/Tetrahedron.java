package challenge4.shapes3d;


public class Tetrahedron extends Shape3D {
	
	public double sideLength;

	public Tetrahedron(double sideLength) {
		super("Tetrahedron");
		this.sideLength = sideLength;
	}
	
	
	public double getSurfaceArea() {
		return Math.sqrt(3) * Math.pow(sideLength, 2);
	}
	

	public double getVolume() {
		return Math.pow(sideLength, 3) / (6 * Math.sqrt(2));
	}


	@Override
	public String getShapeSpecificToStringParameters() {
		return sideLength + " inch sides";
	}
	
}
