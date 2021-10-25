import java.lang.Math.*;

public class Circle extends Shape{
	public double radius;
	
	// Constructor
	public Circle(ShapeDescription c){
		super(c);
		radius = c.getDoubles().get(0);
	}
	
	public double getArea() {
		return (Math.PI * Math.pow(radius, 2));
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
}