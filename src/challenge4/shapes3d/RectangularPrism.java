package challenge4.shapes3d;


public class RectangularPrism extends Shape3D {
	
	public double length, width, height;

	public RectangularPrism(double length, double width, double height) {
		super("Rectangular Prism");
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	
	public double getSurfaceArea() {
		return 2 * ((width * length) + (height * length) + (height * width));
	}
	

	public double getVolume() {
		return length * width * height;
	}
	
	@Override
	public String getShapeSpecificToStringParameters() {
		return length + " inches long | " + width + " inches wide | " + height + " inches tall";
	}
	
}
