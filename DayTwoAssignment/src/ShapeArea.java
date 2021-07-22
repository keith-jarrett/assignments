/* 
 * Keith Jarrett
 * Day Two Assignment 3
 * Jul 21
 * Create a Shape Interface with the methods "calculateArea" and "display". 
 * Create a Rectangle, Circle, and Triangle class to implement that interface.
 */

interface Shape {
	
	void calculateArea(double height, double width);
	void display();
}

class Rectangle implements Shape {
	double area;
	@Override
	public void calculateArea(double height, double width) {
		area = height * width;
		
	}
	@Override
	public void display() {
		System.out.println("the area is " + area + ".");
	}
}


class Triangle implements Shape {
	double area;
	@Override
	public void calculateArea(double height, double width) {
		area = (height * width) / 2;
		
	}
	@Override
	public void display() {
		System.out.println("The area is " + area + ".");
	}
}

class Circle implements Shape {
	double area;
	@Override
	public void calculateArea(double height, double width) {
	}
	
	@Override
	public void display() {
		System.out.println("The area is " + area + ".");
	}
	public void circleArea(double radius) {
		area = Math.PI * radius * radius;
	}
}

class ShapeArea {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.calculateArea(3, 4);
		System.out.print("For rectangle, ");
		r.display();
		
		Triangle t = new Triangle();
		t.calculateArea(3, 4);
		System.out.print("For trinagle, ");
		t.display();
		
		Circle c = new Circle();
		c.circleArea(3);
		c.display();
	}
}