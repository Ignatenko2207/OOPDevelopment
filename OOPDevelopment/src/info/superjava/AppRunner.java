package info.superjava;
import java.util.logging.Level;
import java.util.logging.Logger;

import info.superjava.circle.Circle;
import info.superjava.triangle.Triangle;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(15);
				
		Circle circle2 = new Circle();
		circle2.setRadius(20);
		
		logger.info("Circle with radius " + circle.getRadius() +
				" has area " + circle.getArea());
		
		Triangle triangle = new Triangle();
		triangle.setBase(15);
		triangle.setHeight(14);
		
		logger.log(Level.INFO, "Triangle with base " + triangle.getBase() +
				" and height " + triangle.getHeight() +
				" has area " + triangle.getArea());
		
	}
}
