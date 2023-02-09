package labtest2;
interface Shape {
	  public void rectangleArea(double l, double b);
	  public void squareArea(double side);
	  public void circleArea(double radius);
}
public class Area implements Shape {
	  @Override
	  public void rectangleArea(double l, double b) {
	    System.out.println("Area of rectangle: " + (l * b));
	  }

	  @Override
	  public void squareArea(double side) {
	    System.out.println("Area of square: " + (side * side));
	  }

	  @Override
	  public void circleArea(double radius) {
	    System.out.println("Area of circle: " + (Math.PI * radius * radius));
	  }
	}

