public class Triangle extends Shape{
	public double sideA;
	public double sideB;
	public double sideC;
	
	// Constructor
	public Triangle(ShapeDescription t){
		super(t);
		sideA = t.getDoubles().get(0);
		sideB = t.getDoubles().get(1);
		sideC = t.getDoubles().get(2);
	}
	
	public double getArea() {
		double s = getPerimeter()/2; //semi-perimeter
		double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); //Heron's Formula
		return area;
	}
	
	public double getPerimeter() {
		return sideA + sideB + sideC;
	}
	
}