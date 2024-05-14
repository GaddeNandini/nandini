package assignment;

public class Circle {
	public float Radius;
	public String Colour;
	public float getRadius() {
		return Radius;
	}
	public void setRadius(float radius) {
		Radius = radius;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	@Override
	public String toString() {
		return "Circle [Radius=" + Radius + ", Colour=" + Colour + "]";
	}
	
	
	
	

}
