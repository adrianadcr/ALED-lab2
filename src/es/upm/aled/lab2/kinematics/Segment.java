package es.upm.aled.lab2.kinematics;

import java.util.List;
import java.util.ArrayList;

/**
 * Class that contains all the info of each segment: the length, angle that
 * the segment forms with its parent segment and the child segments.
 * 
 * @author adrianadcr
 */
public class Segment {
	private double length;
	private double angle;
	private List<Segment> children;
	
/**
 * Builds a new Segment knowing its length and angle.
 * @param length in centimeters
 * @param angle in radians
 */
	public Segment(double length, double angle) {
		this.length = length;
		this.angle = angle;
		this.children = new ArrayList<>();
	}
	
/**
 *  Returns the length of the segment.
 * @return length of the segment in centimeters
 */
	public double getLength() {
		return length;
	}
	
/**
 * Returns the angle the segment forms with its father segment.
 * @return angle in radians
 */
	public double getAngle() {
		return angle;
	}
	
/**
 * Returns the child Segments that exit from the nodes of the father segment.
 * @return a List of all the child segments. 
 */
	public List<Segment> getChildren(){
		return children;
	}
	
/** 
 * Changes the angle the segment forms with its parent segment.
 * @param angle in radians
 */
	public void setAngle(double angle) {
		this.angle = angle;	
	}

/**
 * Method that adds children to the list,
 * It doesn't add them if the child is already on the list to avoid the repeated representation of segments.
 * @param child
 */
	public void addChild(Segment child) {
		if(!children.contains(child)) 
			children.add(child);
	}
}


