package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
 

    public static Shape create (RegularShapeType type) throws IllegalArgumentException{
	Shape res;
	switch(type){
	
		case Triangle:
			res = new Triangle();
			break;
		case Quadrilateral:
			res =  new Quadrilateral();
			break;
		case Pentagon:
			res =  new Pentagon();
			break;
		case Hexagon:
			res =  new Hexagon();
			break;
		default:
			throw new IllegalArgumentException();
	}
	return res;
	}
}