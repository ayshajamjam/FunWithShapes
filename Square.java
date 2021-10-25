public class Square extends Shape{
	public double sideLength;
	
	// Constructor
	public Square(ShapeDescription s){
		super(s);
		sideLength = s.getDoubles().get(0);
	}
	
	public double getArea() {
		
		return Math.pow(sideLength, 2);
	}
	
	public double getPerimeter() {
		return sideLength * 4;
	}
	
}