package groupProject2;
/*Create an Interface 'Shape' with undefined methods
 as calculateArea and calculatePerimiter. Create 2
 classes Circle & Square that implements functionality
 defined in the Shape Interface. Test your code.
 */

public interface Shape {
	
	double calculateArea();
	double calculatePerimeter();
}

class Circle implements Shape {
	private double radius;
     
	public Circle(double radius) {
		this.radius=radius;
	}
	@Override
	public double calculateArea() {
   return Math.PI*radius*radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
	
}

class Square implements Shape {
	private double length;
	private double width;
	
	public  Square(double length, double width) {
         this.length=length;
         this.width=width;
		
	}
	@Override
	public double calculatePerimeter() {
		return 2*(length+width);

	}
	@Override
	public double calculateArea() {
		
		return length*width;
	}
		
}
