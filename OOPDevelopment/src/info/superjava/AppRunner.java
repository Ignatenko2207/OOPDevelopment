package info.superjava;

import java.util.logging.Level;
import java.util.logging.Logger;

import info.superjava.circle.Circle;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(15);
		circle.setSomeInt(15);
		
		
		logger.info("Circle with radius " + circle.getRadius() +
				" has area " + circle.getArea());
	}
}
