public class Rectangle extends Shape{
	public double height;
	public double width;
	
	// Constructor
	public Rectangle(ShapeDescription r){
		super(r);
		height = r.getDoubles().get(0);
		width = r.getDoubles().get(1);
	}
	
	public double getArea() {
		return height * width;
	}
	
	public double getPerimeter() {
		return (2 * height) + (2 * width);
	}
	
}