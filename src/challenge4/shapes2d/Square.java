package challenge4.shapes2d;


public class Square extends Rectangle {
	

	public Square(double width) {
		super(width, width);
		shapeType = "Square";
	}
	
	
	@Override
	public String getShapeSpecificToStringParameters() {
		return width + " inch side-lengths";
	}
	
}
