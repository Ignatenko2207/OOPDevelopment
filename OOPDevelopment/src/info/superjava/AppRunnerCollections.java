package info.superjava;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import info.superjava.circle.Circle;
import info.superjava.triangle.Triangle;

public class AppRunnerCollections {

	private static Logger logger = Logger.getLogger(AppRunnerCollections.class.getName());
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(15);
				
		Circle circle2 = new Circle();
		circle2.setRadius(20);
		
		Triangle triangle = new Triangle();
		triangle.setBase(15);
		triangle.setHeight(14);
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(triangle);
		shapes.add(circle2);
		shapes.add(circle);
		
		Shape maxShape = null;
		Shape minShape = null;
		
		if (!shapes.isEmpty()) {
			maxShape = shapes.get(0);
			minShape = shapes.get(0);
		}
		
		
				
		for (int i=0; i< shapes.size(); i++) {
			
			if (maxShape.getArea() < shapes.get(i).getArea()) {
				maxShape = shapes.get(i);
			}
			
			if (i!= 0 && minShape.getArea() > shapes.get(i).getArea()) {
				minShape = shapes.get(i);
			}
		}
		
		logger.log(Level.INFO, "Shape " + maxShape.getClass().getSimpleName() + " has maximal area " + 
		maxShape.getArea());
		
		logger.log(Level.INFO, "Shape " + minShape.getClass().getSimpleName() + " has minimal area " + 
				minShape.getArea());
		
	}
}
