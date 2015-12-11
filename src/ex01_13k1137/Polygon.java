/**
 * 
 */
package ex01_13k1137;

import java.awt.Color;

/**
 * @author admin
 *
 */
public abstract class Polygon extends Shape{
	int numberOfVertex;
	public Polygon(int numberOfVertex){
		super();
		this.numberOfVertex = numberOfVertex;
	}
	
	public Polygon(int numberOfVertex, Color color){
		super(color);
		this.numberOfVertex = numberOfVertex;
	}

}
