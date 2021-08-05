package CodeIt;

public class AreaFinder {
	public static void main(String[] args) {
//This will create an object of circle class
		Shape circle = new Circle();
//This will create an object of Rectangle class
		Shape rectangle = new Rectangle();
// Drumbeats ......
//This should print 78.5
		System.out.println("Shape of circle : " + circle.area());
//This should print 50.0
		System.out.println("Shape of rectangle: " + rectangle.area());
	}
}
