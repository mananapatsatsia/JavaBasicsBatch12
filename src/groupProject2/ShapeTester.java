package groupProject2;

public class ShapeTester {
	public static void main(String[] args) {
		double length=6.0;
		double width=6.0;
		Square s=new Square(length, width);
		 System.out.println("Square - Area: " + s.calculateArea());
         System.out.println("Square - perimeter: " + s.calculatePerimeter());
		
         double radius=2.0;
		Circle c=new Circle(radius);
		System.out.println("Circle - Area: " + c.calculateArea());
        System.out.println("Circle - perimeter: " + c.calculatePerimeter());
	}

}
